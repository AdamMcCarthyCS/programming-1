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

    /**
     * Returns all posts in the newsfeed.
     *
     * @return      The posts contained in the newsfeed
     */
    public String show() {
        // string to accumulate all posts for returning
        String allPosts = "";
        // Add each post in posts to the string to be returned
        for (MessagePost post: posts) {
            allPosts += post.display();
        }
        // if there are no posts return a string informing the user

        if (allPosts.isEmpty()) {
            allPosts = "There are no posts";
        }
        return allPosts;
    }

    /**
     * Returns the number of posts in the posts ArrayList.
     *
     * @return      the current number of posts in the newsfeed
     */
    public int numberOfPosts() {
        return posts.size();
    }

    /**
     * Returns whether the index is valid for the posts ArrayList.
     *
     * @param index     an index to be checked against valid ArrayList index values
     * @return          if the index is valid true; otherwise, false
     */
    public boolean isValidIndex(int index) {
        if (index >= 0 && index < posts.size()) {
            return true;
        }
        return false;
    }

    /**
     * Returns a {@code MessagePost} object if it exists at a given index.
     *
     * @param index     the index in the posts ArrayList where the post can be found
     * @return          the {@code MessagePost} instance if it exists; otherwise null
     */
    public MessagePost findMessagePost(int index) {
        if (isValidIndex(index)) {
            return posts.get(index);
        }
        return null;
    }
}
