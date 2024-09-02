package Accenture;
//They will give the forumla we have to write it in code

public class HeightOfNthBounce {
    public static void main(String[] args) {
        double h = 10;
        double v = 5;
        double vn = 2;
        System.out.println(forumale(h, v, vn));
    }

    private static double forumale(double h, double v, double vn) {
        double en = v / vn;
        return h * (Math.pow(en , 2));
    }
}
