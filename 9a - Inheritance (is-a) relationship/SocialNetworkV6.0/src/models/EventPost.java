package models;

/**
 * A class representing an event with a name and a cost.
 *
 * @version 1.0 (08-Dec-25)
 * @author Adam McCarthy
 * @see Post
 */
public class EventPost extends Post{
    private String eventName;
    private double eventCost;

    public EventPost(String author, String eventName, double eventCost) {
        super(author);
        this.eventName = eventName;
        this.eventCost = eventCost;
    }
}
