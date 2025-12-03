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

    /**
     * Updates a post at a particular index by replacing its fields with the identical fields of
     * another post object passed to the argument
     *
     * @param indexToUpdate     the index of the post to update in the newsfeed posts list
     * @param updateDetails     a MessagePost object whose fields are used to update a retrieved
     *                          post
     * @return                  true if the update takes place; false otherwise
     */
    public boolean updatePost(int indexToUpdate, MessagePost updateDetails) {
        // find the MessagePost object by its index
        MessagePost foundPost = findMessagePost(indexToUpdate);

        /*
            If the MessagePost exists, use the details passed in the updateDetails parameter to
            update the product found at that index in the posts ArrayList
        */
        if (foundPost != null) {
            foundPost.setAuthor(updateDetails.getAuthor());
            foundPost.setMessage(updateDetails.getMessage());
            foundPost.setLikes(updateDetails.getLikes());
            return true;
        }

        // if the post was not found, return false, indicating that no update took place
        return false;
    }
}
