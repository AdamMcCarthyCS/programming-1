/**
 * A class to represent a book.
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class Book {
    // Fields (attributes)
    private String title;
    private String author;
    private int pages;
    
    /**
     * creates and instance of the book class and sets its field values
     *
     * <p>The constructor sets the title, author, and number of pages of a book instance to
     * default values</p>
     */
    public Book() {
        title = "Unknown";
        author = "Unknown";
        pages = 0; // this would have been implicitly set
    }
    
    /**
     * Prints the details of a book
     *
     * @return      a string containing the book title, author, and number of pages
     */
    public String printDetails() {
        return "Title: " + title + ", Author: " + ", Pages: " + pages;
    }
    
    /**
     * Updates book details
     *
     * @param title     the book's title
     * @param author    the book's author
     * @param pages     the book's page count
     */
    public void updateBookDetails(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}
