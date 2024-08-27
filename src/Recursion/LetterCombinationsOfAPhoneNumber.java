package Recursion;
import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        String digits = "2";
        System.out.println(letterCombinations(digits));
    }

    static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return helper("", digits);
    }

    static ArrayList<String> helper(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0'; // Convert char to corresponding digit
        String letters = getLettersForDigit(digit);

        for (char ch : letters.toCharArray()) {
            list.addAll(helper(p + ch, up.substring(1)));
        }

        return list;
    }

    static String getLettersForDigit(int digit) {
        switch (digit) {
            case 2: return "abc";
            case 3: return "def";
            case 4: return "ghi";
            case 5: return "jkl";
            case 6: return "mno";
            case 7: return "pqrs";
            case 8: return "tuv";
            case 9: return "wxyz";
            default: return "";
        }
    }
}
