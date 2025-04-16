class Student {
    // Attributes
    String name;
    int rollNumber;
    int age;

    // Constructor
    Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }
}

public class Student1 {
    public static void main(String[] args) {
        // Create a student object
        Student student1 = new Student("Alice", 101, 20);

        // Display student details
        System.out.println("Student Details:");
        student1.displayDetails();
    }
}