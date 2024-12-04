//array of objects
//Example 3: Array of Objects with User Input

import java.util.Scanner;

class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class StudentClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to hold 3 students
        Student[] students = new Student[3];

        // Get student details from user
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter age of student " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Create a new Student object and add it to the array
            students[i] = new Student(name, age);
        }

        // Display all students using a for loop
        System.out.println("\nStudents entered:");
        for (int i = 0; i < students.length; i++) {
            students[i].display(); // Call the display method for each student
        }
        
//        // Display all students
//        System.out.println("\nStudents entered:");
//        for (Student student : students) {
//            student.display();
//        }

        scanner.close();
    }
}