public class MessagePost {
    /**
     * The message author
     */
    private String author = "";
    /**
     * The message content
     */
    private String message = "";
    /**
     * The number of likes the message received
     */
    private int likes = 0;

    public MessagePost(String author, String message) {
        this.author = author;
        this.message = message;
    }
}
