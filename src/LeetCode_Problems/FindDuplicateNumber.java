package LeetCode_Problems;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,4,3,2};
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums){
        int slow=nums[nums[0]];
        int fast=nums[nums[nums[0]]];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}
