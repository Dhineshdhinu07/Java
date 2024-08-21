package Recursion;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void mergeSortInPlace(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }
        int mid = (start + end) / 2;
        mergeSortInPlace(arr, start, mid);//Left
        mergeSortInPlace(arr, mid, end);//Right
        mergeInPlace(arr, start, mid, end);// Merge
    }
    static void mergeInPlace(int[] arr, int start, int mid, int end){
        int[] mergeArr = new int[end - start];
        int i = start, j = mid, k = 0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mergeArr[k] = arr[i];
                i++;
            }else{
                mergeArr[k] = arr[j];
                j++;
            }
            k++;
        }
        // Now there may be some elements which will be present in the array
        while(i < mid){
            mergeArr[k] = arr[i];
            i++;
            k++;
        }
        while (j < end){
            mergeArr[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(mergeArr, 0, arr, start, mergeArr.length);
    }
}
