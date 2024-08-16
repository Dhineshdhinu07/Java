import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {1,2,1};
        System.out.println(totalFruits(fruits));
    }

    private static int totalFruits(int[] fruits) {
        int l = 0, r = 0, maxlen = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        while(r < fruits.length){
            countMap.put(fruits[r],countMap.getOrDefault(fruits[r],0)+1);
//            if(3)
        }
        return l;
    }
}
