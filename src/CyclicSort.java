import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cycleSort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i , correct);
            }else{
                i++;
            }
        }
        
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
