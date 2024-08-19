package LeetCode_Problems;

public class FindStringWeight {
    public static void main(String[] args) {
        int[] weights = {15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,67,12,0,13,2,3,43,21,-17,2,42};
        String inputString = "Wipro Limited";
        System.out.println("Weight of the string: " + calculateStringWeight(weights, inputString));
    }

    public static int calculateStringWeight(int[] weights, String input) {
        String[] words = input.split(" ");
        int totalWeight = 1;

        for (String word : words) {
            totalWeight *= calculateWordWeight(weights, word);
        }
        return totalWeight;
    }

    private static int calculateWordWeight(int[] weights, String word) {
        int wordWeight = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toUpperCase(word.charAt(i));
            if (c >= 'A' && c <= 'Z') {
                int charWeight = weights[c - 'A'];
                wordWeight += charWeight;
                if ((i == 0 || i == word.length() - 1) && charWeight < 0) {
                    wordWeight += (c - 'A' + 1);
                }
            }
        }
        return wordWeight;
    }
}