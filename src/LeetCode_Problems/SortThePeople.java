package LeetCode_Problems;

import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
    public static String[] sortPeople(String[] names, int[] heights){
        TreeMap<Integer, String> map = new TreeMap<>((a,b) -> b-a);
        for(int i = 0; i < names.length; i++){
            map.put(heights[i],names[i]);
        }
        int i = 0;
        for (String str : map.values()) {
            names[i] = str;
            i++;
        }
        return names;
    }
}
