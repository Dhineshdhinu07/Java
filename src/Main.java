import java.util.*;
// Main class to demonstrate the usage of Student class
public class Main {
    public static void main(String[] args) {
        // Creating a student object
        Student student1 = new Student("John Doe", 20, "S12345");

        // Displaying student details using encapsulated and abstracted methods
        student1.displayStudentDetails();

        // Modifying the student's data using setters (encapsulation)
        student1.setName("Jane Smith");
        student1.setAge(21);  // Valid age
        student1.setRollNumber("S54321");

        // Displaying updated student details
        System.out.println("\nUpdated Student Details:");
        student1.displayStudentDetails();
        StringBuilder st = new StringBuilder();

    }
}
