public class FindMaximumSum {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,4,5,-1};
        int k = 4;
        System.out.println(maxSum(arr, k));
    }

    private static int maxSum(int[] arr, int k) {
        int n = arr.length;
        int left = 0;
        int right = k - 1;
        int max = 0;
        int sum = 0;
        for(int i = left; i <= right; i++){
            sum+= arr[i];
        }
        while(right< n - 1){
            sum = sum - arr[left];
            left++;
            right++;
            sum = sum + arr[right];
            max = Math.max(max, sum);
        }
        return max;
    }
}
