public class FindMissingPositive {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        System.out.println(findMissingPositive(nums));
    }

    private static int findMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                return index+1;
            }
        }
        return -1;
    }
    private static void swap(int[] nums, int start, int correct){
        int temp = nums[start];
        nums[start] = nums[correct];
        nums[correct] = temp;
    }
}
