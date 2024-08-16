import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestSubarraySumLessThanK {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7,10};
        int k = 14;
        Scanner sc = new Scanner(System.in);
        int ip = sc.nextInt();
        if(ip == 1) {
            findSumBrute(arr, k);
        } else if (ip == 2) {
            findSumBetter(arr,k);
        }else{
            findSumOptimal(arr, k);
        }
    }

    private static void findSumOptimal(int[] arr, int k) {
        int sum = 0;
        int maxLen = 0;
        int l = 0;
        int r = 0;
        while(r < arr.length){
            sum += arr[r];
            if(sum > k){
                sum -= arr[l];
                l += 1;
            }else if(sum <= k){
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }
        System.out.println(maxLen);
    }

    private static void findSumBetter(int[] arr, int k) {
        int sum = 0;
        int maxLen = 0;
        int l = 0;
        int r = 0;
        while(r < arr.length){
            sum = sum + arr[r];
            while(sum > k){
                sum = sum - arr[l];
                l += 1;
            }
            if(sum <= k){
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r += 1;
        }
        System.out.println(maxLen);
    }

    private static void findSumBrute(int[] arr, int k) {
        int sum = 0;
        int maxLen = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                if(sum <= k){
                    maxLen = Math.max(maxLen, j - i + 1);
                }else{
                    break;
                }
            }
        }
        System.out.println(maxLen);
    }
}
