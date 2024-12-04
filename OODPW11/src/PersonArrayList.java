import java.util.ArrayList;
import java.util.Scanner;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to hold Person objects
        ArrayList<Person> persons = new ArrayList<>();

        // Get person details from user
        for (int i = 0; i < 3; i++) {  // Assuming we want to input 3 persons
            System.out.print("Enter name of Person " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter age of Person " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Create a new person object and add it to the ArrayList
            persons.add(new Person(name, age));
        }

        // Display all persons using a traditional for loop
        System.out.println("\npersons entered:");
        for (int i = 0; i < persons.size(); i++) {
            persons.get(i).display(); // Access each person using persons.get(i)
        }

        scanner.close();
    }
}
