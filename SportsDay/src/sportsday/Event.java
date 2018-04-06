/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsday;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * 
 * @author Victoria 
 * @version 1
 * @PARAM String eventName - the name of the event
 * @PARAM String eventUnit - will be either "time" or "distance"
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
    
    /**
     * getResults
     * @RETURN String eventResults
     * 
     * Figures out results for either distance and time from competitors and returns it.
     */
    public String getResults() {
        int size = competitors.size();
        System.out.println(size);
        String eventResults =  "Results for: " + getEventName() + "\n"; //list of results in a string
        String eventType = getEventUnit();
        Person person = null;
        if(eventType.equals("distance")) //.equals checks for value equality while == checks for equality in reference
        {
            for(Person p : competitors)
            {
                String result = "\n" + p.getPersonName() + ": " + Double.toString(p.getPersonResult()) + " metres\n"; //distance version of result
                System.out.println(result);
                int size1 = competitors.size();
                eventResults = eventResults + result; //add result to list of results in string eventResults
            }
        }
        if(eventType.equals("time")) //.equals checks for value equality while == checks for equality in reference
        {
            DecimalFormat df = new DecimalFormat("#.###");
            df.setRoundingMode(RoundingMode.CEILING);
            for(Person p : competitors)
            {
                String result = "\n" + p.getPersonName();
                Double res = p.getPersonResult();
                int wholeSecs = p.getPersonResult().intValue(); //the whole number of seconds
                int minutes = wholeSecs/60;
                Double secs = p.getPersonResult() - (minutes * 60);
                String m = Integer.toString(minutes); //string version of minutes
                String s = df.format(secs);           //string version of secs
                result = result + ":  " + m + "m" + s + "s" + "\n"; //time version of result
                eventResults = eventResults + result; //add result to list of results in string eventResults
                
                System.out.println(result);
                System.out.println(eventResults);
            }
        }
        
        return eventResults;
    }
    
    /**
     * addCompetitor
     * @RETURN nothing
     * 
     * Adds competitor to the ArrayList of competitors
     */
    public void addCompetitor(String fName, String lName, Double result) {
        competitors.add(new Person(fName, lName, result));
        System.out.println("Added competitor");
    }
    
    
    /** inner class Person */
    private class Person {
        private String fName; //first name
        private String lName; //last name
        private Double result;
        
        public Person(String fName, String lName, Double result) {
            this.fName = fName;
            this.lName = lName;
            this.result = result;
        }
        
        public String getPersonName() {
            String name = lName + ", " + fName;
            return name;
        }
        
        public Double getPersonResult() {
            return result;
        }
    }
}
