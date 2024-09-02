package Accenture;
//Count LowerCase Letter and print their count

public class CountLowerCaseInString {
    public static void main(String[] args) {
        String s = "Hello Worlddghfjkl";
        LowerCase(s);
    }

    private static void LowerCase(String s) {
        int count = 0;
        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}
