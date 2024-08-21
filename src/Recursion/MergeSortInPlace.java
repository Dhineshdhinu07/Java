package Recursion;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e - s == 1){
            return;
        }
        int mid = (s + e) / 2;
        mergeSortInPlace(arr, s , mid);//Left
        mergeSortInPlace(arr, mid, e);//Right
        mergeInPlace(arr, s, mid, e);// Merge
    }
    static void mergeInPlace(int[] arr, int s, int mid, int e){
        int[] mergeArr = new int[e - s];
        int i = s, j = mid, k = 0;
        while(i < mid && j < e){
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
        while (j < e){
            mergeArr[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(mergeArr, 0, arr, s, mergeArr.length);
    }
}
