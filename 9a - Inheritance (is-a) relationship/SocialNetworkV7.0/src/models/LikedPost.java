package models;

/**
 * A parent class implementing some shared functionality of MessagePost and PhotoPost.
 *
 * @author Adam McCarthy
 * @version 1.0 (09-Dec-25)
 * @see Post
 * @see MessagePost
 * @see PhotoPost
 */
public class LikedPost extends Post {
    private int likes = 0;

    /**
     * Constructs a LikedPost object.
     *
     * @param author    the author of the liked post
     */
    public LikedPost(String author) {
        super(author);
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String display() {
        String str = super.display();

        if(likes > 0) {
            str += ("  -  " + likes + " people like this.\n");
        }
        else {
            str += "0 likes.\n";
        }

        return str;
    }

}



