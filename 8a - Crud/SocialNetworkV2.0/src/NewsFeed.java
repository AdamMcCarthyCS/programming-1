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
    public NewsFeed() {
        this.posts = new ArrayList<>();
    }

    /**
     * Stores a {@code MessagePost} instance.
     *
     * @param post
     */
    public void addPost(MessagePost post) {
        posts.add(post);
    }

    public String show() {
        // string to accumulate all posts for returning
        String allPosts = "";
        // Add each post in posts to the string to be returned
        for (MessagePost post: posts) {
            allPosts += post.display();
        }
        return allPosts;
    }
}
