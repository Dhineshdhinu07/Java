package Accenture;
//Maximum candies can buy
import java.util.Arrays;

public class MaximumCandiesYouCanBuy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 15, 20};
        int n = 6;
        int amt = 15;
        System.out.println(candies(n, arr, amt));
    }

    private static int candies(int n, int[] arr, int amt) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 1; i <= n; i++) {
            if(arr[i - 1] % 5 == 0) count++;
            else if(amt >= arr[i - 1]){
                count++;
                amt -= arr[i];
            }
        }
        return count;
    }
}
