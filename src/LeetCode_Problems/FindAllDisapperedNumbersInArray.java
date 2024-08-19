package LeetCode_Problems;

import java.util.*;

public class FindAllDisapperedNumbersInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i , correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1){
                res.add(j+1);
            }
        }
        return res;

    }
    private static void swap(int[] nums, int start, int correct){
        int temp = nums[start];
        nums[start] = nums[correct];
        nums[correct] = temp;
    }

}
