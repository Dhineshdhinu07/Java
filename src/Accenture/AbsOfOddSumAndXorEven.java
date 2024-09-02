package Accenture;
//Sum the odd indices and xor the even indices and abs the both
public class AbsOfOddSumAndXorEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(findDifference(arr));
    }

    private static int findDifference(int[] arr) {
        int n = arr.length;
        int odd = 0, even = 0;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                even ^= arr[i];
            }else{
                odd += arr[i];
            }
        }
        int abs = Math.abs(odd - even);
        return abs;
    }
}
