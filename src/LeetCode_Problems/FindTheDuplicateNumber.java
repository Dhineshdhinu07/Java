package LeetCode_Problems;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    private static int findDuplicate(int[] nums){
        int i = 0;
        while (i < nums.length){
            if (nums[i] != i + 1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i ,correct);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }return -1;
    }
    private static void swap(int[] nums, int start, int current){
        int temp = nums[start];
        nums[start] = nums[current];
        nums[current] = temp;
    }

}
