package Static;

public class Main {
    public static void main(String[] args) {
        Empolyee Dhinu=new Empolyee("Dhinesh","M",45,false);
        Empolyee rahul=new Empolyee("Rahul","C",49,true);
        Empolyee Sahuul=new Empolyee("Sahul","C",50,true);
        System.out.println(Empolyee.empCount);
        System.out.println(Empolyee.empCount);
        System.out.println(Empolyee.empCount);
        System.out.println(Dhinu.FirstName+Dhinu.LastName+Dhinu.maritalStatus+Dhinu.id+ Empolyee.empCount);
        System.out.println(Dhinu.FirstName+Dhinu.LastName+Dhinu.maritalStatus+Dhinu.id+ Empolyee.empCount);
    }
}
