package Accenture;

public class ContinousTempratureDrop {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 2};
        System.out.println(temperatureDrop(arr));

    }
    static int temperatureDrop(int[] arr){
        int count = 1, max = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
