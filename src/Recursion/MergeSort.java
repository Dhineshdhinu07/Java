package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 5, 6, 9, 19, 32};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0 , mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mergeArr = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mergeArr[k] = first[i];
                i++;
            }else{
                mergeArr[k] = second[j];
                j++;
            }
            k++;
        }
        // Now there may be some elements which will be present in the array
        while(i < first.length){
            mergeArr[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            mergeArr[k] = second[j];
            j++;
            k++;
        }
        return mergeArr;
    }
}
