//array of objects
//Example 1: Array of Custom Objects

class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class BookClient {
    public static void main(String[] args) {
        // Create an array of Book objects
        Book[] books = new Book[3]; // Array to hold 3 books

        // Initialize the array with Book objects
        books[0] = new Book("1984", "George Orwell");
        books[1] = new Book("To Kill a Mockingbird", "Harper Lee");
        books[2] = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Display the details of each book
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}
