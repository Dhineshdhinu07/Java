package classesAndObjects;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Student kunal= new Student();
//        Student dhinesh=new Student(45,"Dhinu",90);
//        System.out.println(dhinesh.marks);
//        kunal.greeting();
//        print(1,2);
//        print("Hii","Dhinesh");
        List<Integer> intList=new ArrayList<>();
        intList.add(2);
        intList.add(5);
        print(intList);

    }
//    private static <T , U>void  print(T t,U u){
//        System.out.println(t);
//        System.out.println(u);
//
//    }
    private static void print(List<?> list){
        System.out.println(list);
    }
}
class Student{
    int roll;
    String name;
    int marks;
 void greeting(){
     System.out.println("Welcome Mr. "+this.name);
 }
    Student(){
        this.roll=16;
        this.name="dhinesh";
        this.marks=98;
    }
    Student(int roll,String name,int marks){
     this.roll=roll;
     this.name=name;
     this.marks=marks;
    }

}
