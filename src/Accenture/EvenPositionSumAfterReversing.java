package Accenture;
//Even position sum after reversing
public class EvenPositionSumAfterReversing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int even = 0, index;
        if(arr.length % 2 != 0) {
            index = 0;
        }
        else {
            index = 1;
        }
        for (int i = index; i < arr.length; i = i + 2) {
            even += arr[i];
        }
        System.out.println("Count " + even);
    }
}
