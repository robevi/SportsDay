/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsday;

/**
 *
 * @author Christi
 */
public class SportsDay {

    /**
     * getEventType
     * 
     * @param eventName
     * @return eventName
     * 
     * returns eventName
     */
    public String getEventType(String eventName) {
        return eventName;
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
        ;
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
