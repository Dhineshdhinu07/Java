import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredictStableState {

    static class Fraction {
        BigInteger numerator;
        BigInteger denominator;

        Fraction(long numerator, long denominator) {
            this.numerator = BigInteger.valueOf(numerator);
            this.denominator = BigInteger.valueOf(denominator);
            simplify();
        }

        Fraction(BigInteger numerator, BigInteger denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
            simplify();
        }

        void simplify() {
            BigInteger gcd = numerator.gcd(denominator);
            numerator = numerator.divide(gcd);
            denominator = denominator.divide(gcd);
        }

        Fraction multiply(Fraction other) {
            return new Fraction(this.numerator.multiply(other.numerator),
                    this.denominator.multiply(other.denominator));
        }

        Fraction add(Fraction other) {
            BigInteger newNumerator = this.numerator.multiply(other.denominator)
                    .add(other.numerator.multiply(this.denominator));
            BigInteger newDenominator = this.denominator.multiply(other.denominator);
            return new Fraction(newNumerator, newDenominator);
        }

        Fraction subtract(Fraction other) {
            BigInteger newNumerator = this.numerator.multiply(other.denominator)
                    .subtract(other.numerator.multiply(this.denominator));
            BigInteger newDenominator = this.denominator.multiply(other.denominator);
            return new Fraction(newNumerator, newDenominator);
        }

        Fraction divide(Fraction other) {
            return new Fraction(this.numerator.multiply(other.denominator),
                    this.denominator.multiply(other.numerator));
        }
    }

    static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(a.gcd(b));
    }

    static int[] predictStableState(int[][] m) {
        int n = m.length;
        List<Integer> terminalStates = new ArrayList<>();
        List<Integer> nonTerminalStates = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (Arrays.stream(m[i]).sum() == 0) {
                terminalStates.add(i);
            } else {
                nonTerminalStates.add(i);
            }
        }

        Fraction[][] Q = new Fraction[nonTerminalStates.size()][nonTerminalStates.size()];
        Fraction[][] R = new Fraction[nonTerminalStates.size()][terminalStates.size()];

        for (int i = 0; i < nonTerminalStates.size(); i++) {
            int rowSum = Arrays.stream(m[nonTerminalStates.get(i)]).sum();
            for (int j = 0; j < nonTerminalStates.size(); j++) {
                Q[i][j] = new Fraction(m[nonTerminalStates.get(i)][nonTerminalStates.get(j)], rowSum);
            }
            for (int j = 0; j < terminalStates.size(); j++) {
                R[i][j] = new Fraction(m[nonTerminalStates.get(i)][terminalStates.get(j)], rowSum);
            }
        }

        Fraction[][] I = new Fraction[Q.length][Q.length];
        for (int i = 0; i < Q.length; i++) {
            for (int j = 0; j < Q.length; j++) {
                I[i][j] = i == j ? new Fraction(1, 1) : new Fraction(0, 1);
            }
        }

        Fraction[][] N = matrixInverse(matrixSubtract(I, Q));
        Fraction[] B = matrixMultiply(N, R)[0];

        return simplifyFractions(B);
    }

    static int[] simplifyFractions(Fraction[] fractions) {
        BigInteger commonDenominator = BigInteger.ONE;
        for (Fraction fraction : fractions) {
            commonDenominator = lcm(commonDenominator, fraction.denominator);
        }

        int[] result = new int[fractions.length + 1];
        for (int i = 0; i < fractions.length; i++) {
            result[i] = fractions[i].numerator.multiply(commonDenominator.divide(fractions[i].denominator)).intValue();
        }
        result[fractions.length] = commonDenominator.intValue();

        return result;
    }

    static Fraction[][] matrixSubtract(Fraction[][] A, Fraction[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        Fraction[][] result = new Fraction[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j].subtract(B[i][j]);
            }
        }
        return result;
    }

    static Fraction[][] matrixInverse(Fraction[][] matrix) {
        int n = matrix.length;
        Fraction[][] augmented = new Fraction[n][2*n];

        for (int i = 0; i < n; i++) {
            System.arraycopy(matrix[i], 0, augmented[i], 0, n);
            for (int j = n; j < 2*n; j++) {
                augmented[i][j] = i == (j-n) ? new Fraction(1, 1) : new Fraction(0, 1);
            }
        }

        for (int i = 0; i < n; i++) {
            int pivot = i;
            for (int j = i + 1; j < n; j++) {
                if (augmented[j][i].numerator.abs().compareTo(augmented[pivot][i].numerator.abs()) > 0) {
                    pivot = j;
                }
            }
            Fraction[] temp = augmented[i];
            augmented[i] = augmented[pivot];
            augmented[pivot] = temp;

            Fraction pivotElement = augmented[i][i];
            for (int j = i; j < 2*n; j++) {
                augmented[i][j] = augmented[i][j].divide(pivotElement);
            }

            for (int k = 0; k < n; k++) {
                if (k != i) {
                    Fraction factor = augmented[k][i];
                    for (int j = i; j < 2*n; j++) {
                        augmented[k][j] = augmented[k][j].subtract(augmented[i][j].multiply(factor));
                    }
                }
            }
        }

        Fraction[][] inverse = new Fraction[n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(augmented[i], n, inverse[i], 0, n);
        }

        return inverse;
    }

    static Fraction[][] matrixMultiply(Fraction[][] A, Fraction[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        Fraction[][] result = new Fraction[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = new Fraction(0, 1);
                for (int k = 0; k < colsA; k++) {
                    result[i][j] = result[i][j].add(A[i][k].multiply(B[k][j]));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] m = {
                {0, 1, 0, 0, 0, 1},
                {4, 0, 0, 3, 2, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };

        System.out.println(Arrays.toString(predictStableState(m)));
    }
}