package Accenture;
//Return the factorial of non vowel characters
public class FactorialOfNonVowelCount {
    public static void main(String[] args) {
        String s = "unisoft";
        System.out.println(fact(s));
    }

    private static int fact(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        int fact = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isVowel = false;
            for (char vowel : vowels){
                if(c == vowel){
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel && c != ' ') {
                count++;
                fact *= count;
            }
        }
        return fact;
    }
}
