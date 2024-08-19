package LeetCode_Problems;

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    private static int[] findErrorNums(int[] nums) {
        int[]arr = new int[2];
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                arr[0] = nums[index];
                arr[1] = index + 1 ;
            }
        }
        return arr;
    }
    private static void swap (int[] nums, int start, int correct){
        int temp = nums[start];
        nums[start] = nums[correct];
        nums[correct] = temp;
    }
}
