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

    public LikedPost(String author, int likes) {
        super(author);
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

}



