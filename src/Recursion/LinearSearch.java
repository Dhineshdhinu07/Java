package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        int target = 3;
        System.out.println(linearSearch(arr, target, 0 ));
    }

    private static int linearSearch(int[] arr, int target, int i) {
        if(i == arr.length ){
            return - 1;
        }
        if(arr[i] == target){
            return i;
        }
        return linearSearch(arr, target, i + 1);
    }
}
