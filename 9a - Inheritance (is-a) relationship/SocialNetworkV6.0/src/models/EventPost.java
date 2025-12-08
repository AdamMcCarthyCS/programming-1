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

    /**
     * Returns the event name.
     *
     * @return      the name of the event
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Returns the cost of the event.
     *
     * @return      the cost of the event
     */
    public double getEventCost() {
        return eventCost;
    }

    /**
     * Sets the name of the event.
     * @param eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * Sets the cost of the event.
     * @param eventCost
     */
    public void setEventCost(double eventCost) {
        this.eventCost = eventCost;
    }
}
