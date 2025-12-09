package controllers;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import models.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class NewsFeed {

    private ArrayList<Post> posts;

    public NewsFeed() {
        posts = new ArrayList<Post>();
    }

    public boolean addPost(Post post) {
        return posts.add(post);
    }

    public String show() {
        String str = "";

        for(Post post: posts) {
            str += posts.indexOf(post) + ": " + post.display() + "\n";
        }

        if (str.isEmpty()){
            return "No Posts";
        }
        else {
            return str;
        }
    }

    public String showPhotoPosts() {
        String str = "";

        for(Post post: posts) {
            if (post instanceof PhotoPost) {
                str += posts.indexOf(post) + ": " + post.display() + "\n";
            }
        }

        if (str.isEmpty()){
            return "No Photo Posts";
        }
        else {
            return str;
        }
    }


    public String showMessagePosts() {
        String str = "";

        for(Post post: posts) {
            if (post instanceof MessagePost) {
                str += posts.indexOf(post) + ": " + post.display() + "\n";
            }
        }

        if (str.isEmpty()){
            return "No Message Posts";
        }
        else {
            return str;
        }
    }

    /**
     * Returns a string containing the string representations of all EventPost objects in the
     * posts ArrayList.
     *
     * @return          A string containing all EventPost Objects in the newsfeed
     */
    public String showEventPosts() {
        String str = "";

        for (Post post: posts) {
            if (post instanceof EventPost) {
                str += posts.indexOf(post) + ": " + post.display() + "\n";
            }
        }

        if (str.isEmpty()) {
            return "No Event Posts";
        }

        return str;
    }

    public Post deletePost(int indexToDelete) {
        if (isValidIndex(indexToDelete)) {
            return posts.remove(indexToDelete);
        }
        return null;
    }

    public boolean updateMessagePost(int indexToUpdate, String author, String message) {
        //find the object by the index number
        Post foundMessage = findPost(indexToUpdate);

        //if the object exists, use the details passed in the parameters to
        //update the found object in the ArrayList.
        if ((foundMessage != null) && (foundMessage instanceof MessagePost)) {
            foundMessage.setAuthor(author);
            ((MessagePost) foundMessage).setMessage(message);
            return true;
        }

        //if the object was not found, return false, indicating that the update was not successful
        return false;
    }

    /**
     * Updates an EventPost object from the ArrayList of posts.
     *
     * <p>The user gives the index, name and cost of an event. If the event is found at the
     * index and is of the type EventPost all its fields are updated.</p>
     *
     * @param indexToUpdate     the index where the Eventpost can be found
     * @param author            the author of the EventPost
     * @param eventName         the name of the event
     * @param eventCost         the cost of the event
     * @return                  true if the EventPost is successfully updated; otherwise false
     */
    public boolean updateEventPost(int indexToUpdate, String author, String eventName,
                                   double eventCost) {
        // find the object by the index number
        Post foundEvent = findPost(indexToUpdate);

        // If the object exists, use the details passed in as arguments to update the found
        // object in the ArrayList
        if ((foundEvent != null) && (foundEvent instanceof EventPost)) {
            foundEvent.setAuthor(author);
            ((EventPost) foundEvent).setEventName(eventName);
            ((EventPost) foundEvent).setEventCost(eventCost);
            return true;
        }

        //if the object was not found, return false, indicating that the update was not successful
        return false;
    }

    public boolean updatePhotoPost(int indexToUpdate, String author, String caption, String filename) {
        //find the object by the index number
        Post foundPost = findPost(indexToUpdate);

        //if the object exists, use the details passed in the parameters to
        //update the found object in the ArrayList.
        if ((foundPost != null) && (foundPost instanceof PhotoPost)){
            foundPost.setAuthor(author);
            ((PhotoPost) foundPost).setCaption(caption);
            ((PhotoPost) foundPost).setFilename(filename);
            return true;
        }

        //if the object was not found, return false, indicating that the update was not successful
        return false;
    }

    public Post findPost(int index) {
        if (isValidIndex(index)) {
            return posts.get(index);
        }
        return null;
    }

    public int numberOfPosts() {
        return posts.size();
    }

    public int numberOfMessagePosts() {
        int number = 0;
        for (Post post: posts){
            if (post instanceof MessagePost){
                number++;
            }
        }
        return number;
    }

    /**
     * Returns the number of EventPost objects in the posts ArrayList.
     *
     * @return      the number of posts in the posts ArrayList
     */
    public int numberOfEventPosts() {
        int number = 0;
        for (Post post: posts) {
            if (post instanceof EventPost) {
                number++;
            }
        }
        return number;
    }

    public int numberOfPhotoPosts() {
        int number = 0;
        for (Post post: posts){
            if (post instanceof PhotoPost){
                number++;
            }
        }
        return number;
    }


    /**
     * The load method uses the XStream component to read all the models.MessagePost objects from the posts.xml
     * file stored on the hard disk.  The read objects are loaded into the posts ArrayList
     *
     * @throws Exception  An exception is thrown if an error occurred during the load e.g. a missing file.
     */
    @SuppressWarnings("unchecked")
    public void load() throws Exception {
        //list of classes that you wish to include in the serialisation, separated by a comma
        Class<?>[] classes = new Class[] { MessagePost.class, PhotoPost.class,
            EventPost.class, Post.class};

        //setting up the xstream object with default security and the above classes
        XStream xstream = new XStream(new DomDriver());
        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypes(classes);

        //doing the actual serialisation to an XML file
        ObjectInputStream in = xstream.createObjectInputStream(new FileReader("posts.xml"));
        posts = (ArrayList<Post>) in.readObject();
        in.close();
    }

    /**
     * The save method uses the XStream component to write all the objects in the posts ArrayList
     * to the posts.xml file stored on the hard disk.
     *
     * @throws Exception  An exception is thrown if an error occurred during the save e.g. drive is full.
     */
    public void save() throws Exception {
        XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("posts.xml"));
        out.writeObject(posts);
        out.close();

    }

    public boolean isValidIndex(int index) {
        return (index >= 0) && (index < posts.size());
    }

    public boolean isValidMessagePostIndex(int index) {
        if (isValidIndex(index)) {
            return (posts.get(index)) instanceof MessagePost;
        }
        return false;
    }

    /**
     * Checks if there is an EventPost object at the given index.
     *
     * @param index     the index of the object to check in posts
     * @return          true if the object at the given index is an EventPost object; false
     * otherwise
     */
    public boolean isValidEventPostIndex(int index) {
        if (isValidIndex(index)) {
            return posts.get(index) instanceof EventPost;
        }
        return false;
    }

    public boolean isValidPhotoPostIndex(int index) {
        if (isValidIndex(index)) {
            return (posts.get(index)) instanceof PhotoPost;
        }
        return false;
    }

    /**
     * Adds a like to a LikedPost if it exists at an index.
     *
     * @param index     the index to check for the post in posts ArrayList.
     */
    public void likeAPost(int index) {
        Post post = null;
        if (isValidIndex(index)) {
            post = posts.get(index);
            if (post instanceof LikedPost) {
                ((LikedPost) post).likeAPost();
            }
        }
    }

    /**
     * Removes a like from a LikedPost if it exists
     * .
     * @param index     the index to check for the post in posts ArrayList.
     */
    public void unlikeAPost(int index) {
        Post post = null;
        if (isValidIndex(index)) {
            post = posts.get(index);
            if (post instanceof LikedPost) {
                ((LikedPost) post).likeAPost();
            }
        }
    }

}
