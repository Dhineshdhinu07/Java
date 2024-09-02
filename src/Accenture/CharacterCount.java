package Accenture;
//Count the occurence of a character
public class CharacterCount {
    public static void main(String[] args) {
        String s = "Hello worlllldll";
        char a = 'l';
        System.out.println(countChar(s, a));
    }

    private static int countChar(String s, char a) {
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == a){
                count+=1;
            }
        }
        return count;
    }
}
