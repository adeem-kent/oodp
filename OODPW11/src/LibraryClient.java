//array of objects
//Example 2: Array of Custom Objects with a Method to Add Books


class Library {
	private Book[] books;
	private int count;

	// Constructor to initialize the array and count
	public Library(int size) {
		books = new Book[size];
		count = 0;
	}

	// Method to add a book
	public void addBook(Book book) {
		if (count < books.length) {
			books[count] = book;
			count++;
		} else {
			System.out.println("Library is full!");
		}
	}

	// Method to display all books
	public void displayBooks() {
		for (int i = 0; i < count; i++) {
			books[i].display();
		}
	}
}

public class LibraryClient {
	public static void main(String[] args) {
		Library library = new Library(5); // Create a library with capacity for 5 books

		// Add books to the library
		library.addBook(new Book("1984", "George Orwell"));
		library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
		library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

		// Display all books in the library
		System.out.println("Books in the library:");
		library.displayBooks();
	}
}
