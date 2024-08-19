package LeetCode_Problems;

public class HillPatternWeight {
    public static int calculateTotalWeight(int totalLevels, int headLevelWeight, int weightIncrement) {
        int totalWeight = 0;
        int currentLevelWeight = headLevelWeight;
        int previousLevelWeight = 0;

        for (int level = 1; level <= totalLevels; level++) {
            int levelWeight = 0;
            levelWeight += currentLevelWeight * level;
            if (level > 1) {
                levelWeight += previousLevelWeight * (level - 1);
            }
            totalWeight += levelWeight;
            previousLevelWeight = currentLevelWeight;
            currentLevelWeight += weightIncrement;
        }

        return totalWeight;
    }

    public static void main(String[] args) {
        int totalLevels = 5;
        int headLevelWeight = 10;
        int weightIncrement = 2;
        int result = calculateTotalWeight(totalLevels, headLevelWeight, weightIncrement);
        System.out.println("Total weight of the hill pattern: " + result);
    }
}