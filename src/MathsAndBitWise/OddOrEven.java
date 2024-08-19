package MathsAndBitWise;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 68;
        System.out.println((n & 1) == 1 ? "Odd" : "Even");
        // Anything & 1 = anything and if LSB == 1 while N & 1, then it is odd.
    }
}
