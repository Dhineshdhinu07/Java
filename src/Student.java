public class Student {

    // Private data members to achieve encapsulation
    private String name;
    private int age;
    private String rollNumber;

    // Constructor to initialize the student object
    public Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Getter for name (Abstraction)
    public String getName() {
        return name;
    }

    // Setter for name (Abstraction)
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age (Abstraction)
    public int getAge() {
        return age;
    }

    // Setter for age (Abstraction)
    public void setAge(int age) {
        // Validation logic can be added here to maintain integrity of data
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    // Getter for rollNumber (Abstraction)
    public String getRollNumber() {
        return rollNumber;
    }

    // Setter for rollNumber (Abstraction)
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Roll Number: " + rollNumber);
    }
}

