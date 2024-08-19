package LeetCode_Problems;

import java.util.*;

public class TwoOutOfThree {
    public static void main(String[] args) {
        int[] nums1 = {3,1};
        int[] nums2 = {2, 3};
        int[] nums3 = {1,2};
        List<Integer> result = twoOutOfThree(nums1, nums2, nums3);
        System.out.println(result);
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);
        for (int num : nums3) set3.add(num);
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : set1) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        for (int num : set2) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        for (int num : set3) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() >= 2) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
