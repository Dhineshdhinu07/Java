public class SumofNonPrimeIndex {
    public static void main(String[] args) {
        int[] input1 = {10,20,30,40,50,60,70,80,90,100};
        int input2= input1.length;
        System.out.println(sumOfNonPrimeIndexValues(input1, input2));
    }
    static int sumOfNonPrimeIndexValues(int[]input1,int input2){
        int sum=0;
        for (int i=0;i<input2;i++){

            if(i<=1) sum+=input1[i];
            if(i==2) continue;
            if(i%2==0) sum+=input1[i];
            for (int j = 3; j < Math.sqrt(i); j+=2) {
                if(i%j==0) sum+=input1[i];
            }
        }
        return sum;
    }

}


