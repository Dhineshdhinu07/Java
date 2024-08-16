public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));

    }

    private static int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, zeros = 0, maxLen = 0;
        while(r < nums.length){
            if(nums[r] == 0) zeros++;
            if(zeros > k){
                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            }
            if(zeros <= k){
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return maxLen;
    }
}
