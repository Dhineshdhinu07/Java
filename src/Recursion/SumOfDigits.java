package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumOfDigits(n));
        System.out.println(productOfDigits(n));
    }

    private static int productOfDigits(int n) {
        if(n % 10 == n){
            return n;
        }
        return (n % 10) * productOfDigits(n / 10);
    }

    private static int sumOfDigits(int n) {
        if(n == 0){
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
}
