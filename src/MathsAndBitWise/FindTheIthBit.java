package MathsAndBitWise;

public class FindTheIthBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;
        System.out.println(findBit(n,i));
    }

    private static int findBit(int n, int i) {
        return (n >> (i - 1)) % 2;
        //masking and making the bit move towards lsb and taking mod by 2 to get the lsb...

    }
}
