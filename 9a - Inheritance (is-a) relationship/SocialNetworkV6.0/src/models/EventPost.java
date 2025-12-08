package models;

import utils.Utilities;

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
        this.eventName = Utilities.truncateString(eventName, 35);
        setEventCost(eventCost);
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
        if (Utilities.validateStringLength(eventName, 35)) {
            this.eventName = eventName;
        }
    }

    /**
     * Sets the cost of the event.
     *
     * <p>The cost of the event is set if it is in the closed interval [0, 9999]</p>
     * @param eventCost     the cost of the event
     */
    public void setEventCost(double eventCost) {
        if (Utilities.isWithinInclusiveRange(eventCost, 0, 99999)) {
            this.eventCost = eventCost;
        }
    }

    /**
     *  Returns a String representation of the MessagePost object including the inherited fields
     *  from Post superclass.
     *
     * @return      A string representation of the MessagePost object
     */
    @Override
    public String display() {
        String str = super.display();

        if (!eventName.isEmpty()){
            str += "\t" + eventName + "\n";
        }

        if (!eventName.isEmpty()){
            str += "\t" + eventCost + "\n";
        }

        return str;

    }
}
