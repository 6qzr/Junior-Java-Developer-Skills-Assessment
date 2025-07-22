// Main class to test everything
public class Library {
    public static void main(String[] args) {
        // Create 2 regular books
        Book scienceBook = new Book("Science", "Hanz Zimmer", 800);
        Book carsBook = new Book("The Cars", "Paul Walker", 233);
        // Create 1 textbook
        Textbook linuxTextBook = new Textbook("Linux for Beginners", "Linus Torvalds", 740, "CS", 7);
        // Test borrowing and returning
        scienceBook.borrowBook();
        scienceBook.returnBook();
        // Display information for all books
        scienceBook.displayInfo();
        carsBook.displayInfo();
        linuxTextBook.displayInfo();
    }
}
