import java.util.ArrayList;

/**
 * This class stores and returns posts to the user for printing.
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class NewsFeed {
    /**
     * A collection of all posts in the newsfeed.
     */
    private ArrayList<MessagePost> posts;

    /**
     * Constructs a newsfeed object.
     */
    public NewsFeed(ArrayList<MessagePost> posts) {
        this.posts = posts;
    }
}
