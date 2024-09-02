package Accenture;
//Calculate Dividend index in an array based on Q, D, R given

public class DividendIndex {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int Q = 2, D = 2, R = 1;
        System.out.println(dividendFind(arr, Q, D, R));
    }

    private static int dividendFind(int[] arr, int q, int d, int r) {
        int n = arr.length;
        int div = (d * q) + r;
        for (int i = 0; i < n; i++) {
            if(arr[i] == div){
                return i;
            }
        }
        return -1;
    }
}
