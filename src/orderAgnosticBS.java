public class orderAgnosticBS {
    public static void main(String[] args) {
        int[]arr={90,80,75,45,8,2,1};
        int target=2;
        System.out.println(orderAgnosticBinarySearch(arr,target));
    }
    static int orderAgnosticBinarySearch(int[]arr,int target){
        int left=0;
        int right= arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target==arr[mid])return mid;
            else if(target>=arr[mid]) right=mid-1;
            else if(target<=arr[mid]) left=mid+1;
        }
        return -1;
    }
}
