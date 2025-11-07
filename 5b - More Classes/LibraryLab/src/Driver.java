/**
 * This is the entry point to the program.
 *
 * <p>This contains the main method where the Book class will be tested.</p>
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class Driver {
    public static void main(String[] args) {
        // Create a Book instance
        Book myBook = new Book();
        
        // Add book details
        myBook.updateBookDetails("The Secret History", "Donna Tartt", 544, 1);
        
        // Print the book details
        System.out.println("Book: " + myBook.printDetails());
        
        // Make 100,000 sales
        for (int i = 0; i < 100_000; i++) {
            myBook.recordSale();
        }
        
        // Print updated book details
        System.out.println("Book (Update 1): " + myBook.printDetails());
        
        // Update book sales manually
        myBook.updateBookDetails("the secret history", "donna tartt", 640, 5_000_000);
        
        // Print updated book details
        System.out.println("Book (Update 2): " + myBook.printDetails());
        
    }
}
