/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsday;

import java.util.ArrayList;

/**
 *
 * @author Christi
 */
public class SportsDay {

    private ArrayList<Event> sportsDayEvents = new ArrayList<Event>();
    
    public SportsDay()
    {
     
    }

    /**
     * getEventType
     * 
     * @param eventName
     * @return unit
     * 
     * returns eventName
     */
    public String getEventType(String eventName) {
        Event event = getEvent(eventName); //gets the event with the correct name
        String unit = event.getEventUnit();
        return unit;
    }
    
    /**
     * addResult
     * 
     * @param eventName
     * @param fName
     * @param lName
     * @param result 
     */
    public void addResult(String eventName, String fName, String lName, Double result) {
        Event event = getEvent(eventName);
        System.out.println("Got Event");
        event.addCompetitor(fName, lName, result); //Add a competitor object to the event.
    }
    
    public void createNewEvent(String eventName, String eventUnit) {
        Event event = new Event(eventName, eventUnit);
        sportsDayEvents.add(event);
    }
    
    /**
     * getEvent
     * 
     * @param name
     * @return event
     * 
     * returns event in SportsDay
     */
    public Event getEvent(String name) {
        Event event = null;
        for(Event ev : sportsDayEvents)
        {
            if(ev.getEventName().equals(name))
            {
                System.out.println("found object: " + ev.getEventName().toString());
                event = ev;
            }
        }
        return event;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create instance of GUI application
        javax.swing.JFrame window = new javax.swing.JFrame("Sportsday");
        window.getContentPane().add(new SportsDayGUI());
        window.setVisible(true);
        window.pack();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
    
}
