/**
 * This class runs the application and handles user input/output.
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class Driver {
    private MessagePost post;
    private NewsFeed newsfeed;
    /**
     * The main method is the starting point for the program.
     *
     * @param args      a string array of command line arguments (unused)
     */
    public static void main(String[] args) {
        new Driver();
    }

    /**
     * Reads user input to create a post and stores in newsfeed.
     */
    private void addPost() {
        // Read in message details
        String author = ScannerInput.readNextLine("Enter the message author: ");
        String message = ScannerInput.readNextLine("Enter the message: ");
        int likes = ScannerInput.readNextInt("Enter the number of likes received: ");

        // Create a MessagePost instance
        post = new MessagePost(author, message);
        post.setLikes(likes);

        // Add post to newsfeed
        newsfeed.addPost(post);
        // Add newline formatting for easier reading
        System.out.println();
    }

    /**
     * Asks user for length of feed and reads in posts.
     */
    public void processFeed() {
        // Read in number of messages that will be in the feed
        int numberOfPosts = ScannerInput.readNextInt("Enter the number of messages to add to the " +
                "feed: ");
        for (int i = 0; i < numberOfPosts; i++) {
            addPost();
        }
        // Add newline formatting for easier reading
        System.out.println();
    }
}
