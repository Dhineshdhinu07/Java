public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 3, 4, 8, 10, 12};
        int target = 15;
        int ans = binarySearch(arr, target);
        System.out.println(ans); 
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; 

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }
        return -1;
    }
}
