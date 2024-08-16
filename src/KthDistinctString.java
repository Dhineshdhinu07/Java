import java.util.*;

public class KthDistinctString {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinct(arr,k));

    }

    private static String kthDistinct(String[] arr, int k) {
        int count = 0;
        String ans = "";
        Map<String, Integer> countMap = new HashMap<>();
        for(String s : arr){
            countMap.put(s,countMap.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String, Integer> entry : countMap.entrySet()){
            if(entry.getValue()<2){
                ans += entry;
            }
        }

        char c = ans.charAt(k-1);
        return Character.toString(c);
    }
}
