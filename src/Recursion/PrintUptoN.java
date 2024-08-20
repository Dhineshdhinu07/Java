package Recursion;

public class PrintUptoN {
    public static void main(String[] args) {
        int n = 8;
        helper(n);
        helperBoth(n);
    }

    private static void helperBoth(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);
        helperBoth(n - 1);
    }


    static void helper( int n){
        if(n == 0){
            return;
        }
        helper(n - 1);
        System.out.println(n);
    }
}
