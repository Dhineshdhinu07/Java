public class PassThePillow {
    public static void main(String[] args) {
        int n=4;
        int time=5;
        System.out.println(passThePillow(n,time));
    }
    static int passThePillow(int n,int time){
        int rounds=time/(n-1);
        int index=0;
        if(rounds%2==0) index=1+time%(n-1);
        else index=n-time%(n-1);
        return index;
    }
}
