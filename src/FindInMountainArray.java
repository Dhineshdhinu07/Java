public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 5;
        System.out.println(search(arr,target));
    }
    static int search(int[]arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstHalf = orderAgnosticBinarySearch(arr,target,0, peak);
        if(firstHalf != -1) return firstHalf;
        return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
    }
    public static int peakIndexInMountainArray(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderAgnosticBinarySearch(int[]arr,int target, int left, int right){
        while(left<=right){
            int mid=(left+right)/2;
            if(target==arr[mid])return mid;
            else if(target>=arr[mid]) right=mid-1;
            else if(target<=arr[mid]) left=mid+1;
        }
        return -1;
    }
}
