package controllers;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import models.MessagePost;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        for (int i = 0; i < posts.size(); i++) {
            allPosts += i + ": " + posts.get(i).display();
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

    /**
     * Deletes a post from the news feed given a valid index is provided.
     *
     * @param indexToDelete     the index of the posts ArrayList where the post to be deleted exists
     * @return                  the deleted post if it exists; otherwise null
     */
    public MessagePost deletePost(int indexToDelete) {
        if (isValidIndex(indexToDelete)) {
            return posts.remove(indexToDelete);
        }
        return null;
    }

    /**
     * Loads MessagePost instances which are saved to an XML file into the program.
     *
     * <p>This method loads saved posts from the project root into the program. If the posts are
     * not loaded correctly it throws and Exception. The posts that are loaded are appended to
     * the previously existing posts rather than overwriting them.</p>
     *
     * @throws Exception    an exception which is thrown if posts are not successfully loaded
     */
    @SuppressWarnings("unchecked")
    public void load() throws Exception {
        // List classes that you wish to include in the Serialisation, separated by a comma
        Class<?>[] classes = new Class[] { MessagePost.class };

        // Set up the XStream object with default security and the above class
        XStream xstream = new XStream(new DomDriver());
        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypes(classes);

        // Serialise objects to an XML file
        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("posts.xml"));

        // Create an ArrayList of the loaded posts
        ArrayList<MessagePost> loadedPosts = (ArrayList<MessagePost>) is.readObject();
        // Append the loaded posts to the current list of posts rather than overwriting them
        posts.addAll(loadedPosts);
        is.close();
    }

    /**
     * Saves the programs MessagePost objects to an XML file.
     *
     * <p>The method saves all the message post objects to an XML file in the root directory of
     * the project. The existing MessagePost objects in that XML file are overwritten.</p>
     *
     * @throws Exception    an exception which is thrown if the MessagePost instances are not
     * saved successfully
     */
    public void save() throws Exception {
        XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("posts.xml"));
        out.writeObject(posts);
        out.close();
    }
}
