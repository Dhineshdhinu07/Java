package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {
    public static void main(String[] args) {
        subsequence("", "abc");
        System.out.println(subArrayList("", "abc"));
    }

    private static ArrayList<String> subArrayList(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subArrayList(p + ch, up.substring(1));
        ArrayList<String> right = subArrayList(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subsequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsequence(p + ch, up.substring(1));
        subsequence(p, up.substring(1));
    }
}
