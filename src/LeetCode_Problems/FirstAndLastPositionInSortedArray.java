package LeetCode_Problems;

import java.util.Arrays;

public class FirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int[]nums={5,7,7,8,8,10};
        int target=8;
        int ans[]=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[]nums,int target){
        int[] range={-1,-1};
        int start= search(nums,target,true);
        int end= search(nums, target, false);
        range[0]=start;
        range[1]=end;
        return range;
    }
    static int search(int[]nums, int target, boolean searchIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end) {
            int mid = start + (end - start)/ 2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start= mid + 1;
            }else{
                ans = mid;
                if(searchIndex) end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }
}
