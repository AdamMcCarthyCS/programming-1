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
    private int bookSales;
    
    /**
     * creates and instance of the book class and sets its field values
     *
     * <p>The constructor sets the title, author, number of pages, and sales of a book
     * instance to default values</p>
     */
    public Book() {
        title = "Unknown";
        author = "Unknown";
        pages = 0; // this would have been implicitly set
        bookSales = 0;
    }
    
    /**
     * Prints the details of a book
     *
     * @return      a string containing the book title, author, and number of pages
     */
    public String printDetails() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Sales: "
            + bookSales;
    }
    
    /**
     * Updates book details
     *
     * @param title     the book's title
     * @param author    the book's author
     * @param pages     the book's page count
     * @param bookSales the book's sales count
     */
    public void updateBookDetails(String title, String author, int pages, int bookSales) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.bookSales = bookSales;
    }
    
    /**
     * Records a sale of a book
     */
    public void recordSale() {
        bookSales += 1;
    }
}
