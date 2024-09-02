package Accenture;
//Count the no of whitespaces in two strings and return the abs of it.
public class AbsBtwTwoStrings {
    public static void main(String[] args) {
        String s1 = "Hi Everyone     ";
        String s2 = "I'm dhinesh from mars!!";
        System.out.println(spaces(s1, s2));
    }

    private static int spaces(String s1, String s2) {
        int ct1 = 0, ct2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == ' '){
                ct1++;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == ' '){
                ct2++;
            }
        }
        return Math.abs(ct1 - ct2);
    }
}
