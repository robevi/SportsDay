/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsday;

import java.util.ArrayList;

/**
 *
 * 
 * @author Victoria 
 * @version 1
 * @PARAM String eventName - the name of the event
 * @PARAM String eventUnit - wil be either "time" or "distance"
 * Holds the event information and a private inner class of the competitors and their results.  The data for each event is held as an array of
 * competitors (person objects).  Each competitor has their data held within the person instance.  This means that the data for the event is encapsulated within the event and 
 * person objects.  This is much more secure than a general array of results.
 * Rounding mode is used to correct double rounding errors.
 */

public class Event {
    private String eventName;
    private String eventUnit;
    private Person person;
    private ArrayList<Person> competitors = new ArrayList<Person>();
    
    /**
     * Constructor for objects of class Event
     * @PARAM String eventName - the name of the event
     * @PARAM String eventUnit - will be either "time" or "distance" 
     */

    public Event(String eventName, String eventUnit) {
        //initialise instance variables
        this.eventName = eventName;
        this.eventUnit = eventUnit;
    }
    
    /**
     * getEventName
     * @RETURN String eventName
     * 
     * Return the instance eventName
     */
    public String getEventName() {
        return eventName;
    }
    
    /**
     * getEventUnit
     * @RETURN String eventUnit
     * 
     * Return the instance eventUnit -either as "time" or "distance"
     */
    public String getEventUnit() {
        return eventUnit;
    }
}
