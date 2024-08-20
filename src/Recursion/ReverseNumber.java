package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        reverseNum(n);
        System.out.println(sum);
    }
    static int sum = 0;
    private static void reverseNum(int n) {
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNum(n / 10);
    }
}
