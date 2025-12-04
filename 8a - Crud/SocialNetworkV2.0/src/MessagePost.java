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

    // GETTERS

    /**
     * Returns the author.
     *
     * @return      the name of the message author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the message content.
     *
     * @return      the text content of the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Returns the number of likes the message received.
     *
     * @return      the total number of likes received by the message
     */
    public int getLikes() {
        return likes;
    }

    // SETTERS

    /**
     * Sets the name of the author.
     *
     * @param author    the authors full name
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets the message content
     *
     * @param message   the text content of the message.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Sets the number of likes the message received.
     *
     * @param likes     the number of likes the message received
     */
    public void setLikes(int likes) {
        this.likes = likes;
    }

    /**
     * Returns a message displaying a message, author and number of likes.
     *
     * @return          a formatted version of the message detials
     */
    public String display() {
        String str = "";

        str += (author + "\n");

        if (likes > 0) {
            str += (" - " + likes + " people like this.\n");
        } else {
            str += " - " + "0 likes.\n";
        }

        if (!message.isEmpty()) {
            str += "\t" + message + "\n";
        }

        return str;
    }
}
