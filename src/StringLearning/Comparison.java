package StringLearning;

public class Comparison {
    public static void main(String[] args) {
        String a = "Dhinesh";
        String b = "Dhinesh";
        // == comparator
//        System.out.println(a==b);
        String name1 = new String("Dhinu");
        String name2 = new String("Dhinu");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
