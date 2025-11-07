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
     * Constructor of Book class
     *
     * <p>The constructor sets the title, author, and number of pages of a book instance to
     * default values</p>
     */
    public Book() {
        title = "Unknown";
        author = "Unknown";
        pages = 0; // this would have been implicitly set
    }
}
