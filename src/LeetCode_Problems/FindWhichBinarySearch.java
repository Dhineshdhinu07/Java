package LeetCode_Problems;

public class FindWhichBinarySearch {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int target=2;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[]arr,int target){
        int left=0;
        int right= arr.length-1;
        if(arr[left]<arr[right]) {
            System.out.println("It is normal binary search");
            return binarySearchAlgo(arr, target, left, right);
        }
        else {
            System.out.println("It is order agnostic binary search");
            return orderAgnosticbinarySearch(arr, target, left, right);
        }
    }

    private static int orderAgnosticbinarySearch(int[] arr, int target, int left, int right) {
        while(left<=right){
            int mid=(left+right)/2;
            if(target==arr[mid])return mid;
            else if(target>=arr[mid]) right=mid-1;
            else if(target<=arr[mid]) left=mid+1;
        }
        return -1;
    }

    private static int binarySearchAlgo(int[] arr, int target, int left, int right) {
        while(left<=right){
            int mid=(left+right)/2;
            if(target==arr[mid]) return mid;
            else if (target<=arr[mid]) {
                right=mid-1;
            } else if (target>=arr[mid]) {
                left=mid+1;
            }
        }
        return -1;
    }

}
