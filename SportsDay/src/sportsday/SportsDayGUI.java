/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsday;

import javax.swing.SpinnerNumberModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Christi
 */
public class SportsDayGUI extends javax.swing.JPanel {

    /**
     * Creates new form SportsDayGUI
     */
    public SportsDayGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        Home_Panel = new javax.swing.JPanel();
        Choose_Label = new javax.swing.JLabel();
        viewResultsButton = new javax.swing.JButton();
        selectResultsEvent = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        Add_Event_Panel = new javax.swing.JPanel();
        Age_Label = new javax.swing.JLabel();
        ages = new javax.swing.JComboBox<>();
        Gender_Label = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        Event_Label_Add = new javax.swing.JLabel();
        eventTitle = new javax.swing.JTextField();
        unit = new javax.swing.JComboBox<>();
        saveEventButton = new javax.swing.JButton();
        Add_Results_Panel = new javax.swing.JPanel();
        Event_Label_Results = new javax.swing.JLabel();
        selectEvent = new javax.swing.JComboBox<>();
        First_Name_Label = new javax.swing.JLabel();
        competitorFirstName = new javax.swing.JTextField();
        Last_Name_Label = new javax.swing.JLabel();
        competitorLastName = new javax.swing.JTextField();
        results = new javax.swing.JLabel();
        metresLabel = new javax.swing.JLabel();
        minsLabel = new javax.swing.JLabel();
        resultField1= new SpinnerNumberModel(spinnerValue,spinnerMin,spinnerMax,spinnerInterval);
        spinner1 = new javax.swing.JSpinner(resultField1);
        cmLabel = new javax.swing.JLabel();
        secsLabel = new javax.swing.JLabel();
        resultField2= new SpinnerNumberModel(spinnerValue,spinnerMin,spinnerMax,spinnerInterval);
        spinner2 = new javax.swing.JSpinner(resultField2);
        mmLabel = new javax.swing.JLabel();
        msecsLabel = new javax.swing.JLabel();
        resultField3 = new SpinnerNumberModel(spinnerValue,spinnerMin,spinnerMax,spinnerInterval);
        spinner3 = new javax.swing.JSpinner(resultField3);
        saveResultButton = new javax.swing.JButton();

        jTabbedPane.setPreferredSize(new java.awt.Dimension(800, 600));

        Choose_Label.setText("Choose event to display results");

        viewResultsButton.setText("View Results");
        viewResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewResultsButtonActionPerformed(evt);
            }
        });

        selectResultsEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 800));

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setPreferredSize(new java.awt.Dimension(164, 800));
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout Home_PanelLayout = new javax.swing.GroupLayout(Home_Panel);
        Home_Panel.setLayout(Home_PanelLayout);
        Home_PanelLayout.setHorizontalGroup(
            Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Home_PanelLayout.createSequentialGroup()
                        .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(selectResultsEvent, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Choose_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addComponent(viewResultsButton)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        Home_PanelLayout.setVerticalGroup(
            Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Choose_Label)
                    .addComponent(viewResultsButton))
                .addGap(40, 40, 40)
                .addComponent(selectResultsEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Home - View Results", Home_Panel);

        Age_Label.setText("Age: (e.g. U15 - Under 15 year olds)");

        ages.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "U11", "U12", "U13", "U14", "U15", "U16", "U17", "U18", "U19" }));

        Gender_Label.setText("Gender:");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boys", "Girls" }));

        Event_Label_Add.setText("Event Title (e.g. Long Jump) and unit (i.e. Time hh:mm:ss and Distance M:cm): ");

        unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Time", "Distance" }));

        saveEventButton.setText("Save Event");
        saveEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEventButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Add_Event_PanelLayout = new javax.swing.GroupLayout(Add_Event_Panel);
        Add_Event_Panel.setLayout(Add_Event_PanelLayout);
        Add_Event_PanelLayout.setHorizontalGroup(
            Add_Event_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Event_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Add_Event_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Age_Label)
                    .addComponent(Gender_Label)
                    .addComponent(Event_Label_Add)
                    .addComponent(saveEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Add_Event_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ages, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gender, javax.swing.GroupLayout.Alignment.LEADING, 0, 87, Short.MAX_VALUE))
                    .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        Add_Event_PanelLayout.setVerticalGroup(
            Add_Event_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Event_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Age_Label)
                .addGap(18, 18, 18)
                .addComponent(ages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Gender_Label)
                .addGap(18, 18, 18)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Event_Label_Add)
                .addGap(18, 18, 18)
                .addComponent(eventTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(saveEventButton)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Add New Event", Add_Event_Panel);

        Event_Label_Results.setText("Event:");

        selectEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEventActionPerformed(evt);
            }
        });

        First_Name_Label.setText("First Name:");

        competitorFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                competitorFirstNameActionPerformed(evt);
            }
        });

        Last_Name_Label.setText("Last Name:");

        results.setText("Results:");

        metresLabel.setText("Metres:");

        minsLabel.setText("Minutes:");

        cmLabel.setText("cm:");

        secsLabel.setText("Seconds:");

        mmLabel.setText("mm:");

        msecsLabel.setText("Milliseconds:");

        saveResultButton.setText("Save Results");
        saveResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveResultButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Add_Results_PanelLayout = new javax.swing.GroupLayout(Add_Results_Panel);
        Add_Results_Panel.setLayout(Add_Results_PanelLayout);
        Add_Results_PanelLayout.setHorizontalGroup(
            Add_Results_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Results_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Add_Results_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_Results_PanelLayout.createSequentialGroup()
                        .addComponent(Event_Label_Results)
                        .addGap(18, 18, 18)
                        .addComponent(selectEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(First_Name_Label)
                        .addGap(18, 18, 18)
                        .addComponent(competitorFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(Last_Name_Label)
                        .addGap(18, 18, 18)
                        .addComponent(competitorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(results)
                    .addComponent(metresLabel)
                    .addComponent(minsLabel)
                    .addComponent(cmLabel)
                    .addComponent(secsLabel)
                    .addComponent(mmLabel)
                    .addComponent(msecsLabel)
                    .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveResultButton))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        Add_Results_PanelLayout.setVerticalGroup(
            Add_Results_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Results_PanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(Add_Results_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Event_Label_Results)
                    .addComponent(selectEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(First_Name_Label)
                    .addComponent(competitorFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Last_Name_Label)
                    .addComponent(competitorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(results)
                .addGap(27, 27, 27)
                .addComponent(metresLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minsLabel)
                .addGap(40, 40, 40)
                .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(cmLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secsLabel)
                .addGap(40, 40, 40)
                .addComponent(spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(mmLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msecsLabel)
                .addGap(40, 40, 40)
                .addComponent(spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(saveResultButton)
                .addContainerGap())
        );

        metresLabel.setVisible(false);
        cmLabel.setVisible(false);
        mmLabel.setVisible(false);

        jTabbedPane.addTab("Add Event Results", Add_Results_Panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewResultsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewResultsButtonActionPerformed

    private void saveEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEventButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveEventButtonActionPerformed

    private void competitorFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_competitorFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_competitorFirstNameActionPerformed

    private void saveResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveResultButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveResultButtonActionPerformed

    private void selectEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectEventActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add_Event_Panel;
    private javax.swing.JPanel Add_Results_Panel;
    private javax.swing.JLabel Age_Label;
    private javax.swing.JLabel Choose_Label;
    private javax.swing.JLabel Event_Label_Add;
    private javax.swing.JLabel Event_Label_Results;
    private javax.swing.JLabel First_Name_Label;
    private javax.swing.JLabel Gender_Label;
    private javax.swing.JPanel Home_Panel;
    private javax.swing.JLabel Last_Name_Label;
    private javax.swing.JComboBox<String> ages;
    private javax.swing.JLabel cmLabel;
    private javax.swing.JTextField competitorFirstName;
    private javax.swing.JTextField competitorLastName;
    private javax.swing.JTextField eventTitle;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel metresLabel;
    private javax.swing.JLabel minsLabel;
    private javax.swing.JLabel mmLabel;
    private javax.swing.JLabel msecsLabel;
    private javax.swing.JLabel results;
    private javax.swing.JButton saveEventButton;
    private javax.swing.JButton saveResultButton;
    private javax.swing.JLabel secsLabel;
    private javax.swing.JComboBox<String> selectEvent;
    private javax.swing.JComboBox<String> selectResultsEvent;
    private javax.swing.JSpinner spinner1;
    private javax.swing.JSpinner spinner2;
    private javax.swing.JSpinner spinner3;
    private javax.swing.JTextArea textArea;
    private javax.swing.JComboBox<String> unit;
    private javax.swing.JButton viewResultsButton;
    // End of variables declaration//GEN-END:variables
   
    //jspinner variables 
    private Integer spinnerMax;
    private Integer spinnerMin = 0;
    private Integer spinnerInterval = 1;
    private Integer spinnerValue = 0;
    
    private SpinnerNumberModel resultField1;
    private SpinnerNumberModel resultField2;
    private SpinnerNumberModel resultField3;
    // End of jspinner variables  
    
    /**
     * Method to validate length of a string to see if it fits between the min and max lengths.
     * @PARAM String inputString        The actual string that is being tested.
     * @PARAM Integer minLength         The minimum length of the string that will pass the test.
     * @PARAM Integer maxLength         The maximum length of the string that will pass the test.
     * @RETURN Boolean                  True if the input string is greater than or equal to minLength and less than or equal to maxLength, otherwise, false.
     * 
     * This method checks a strings length and returns boolean true or false if it passes the min/max length test.  It is used for validating name and event string
     * length.
     */
    public  Boolean checkStringLength( String inputString, Integer minLength, Integer maxLength  )
    {
        int stringLength = inputString.length();
        
        if (stringLength >= minLength && stringLength <= maxLength){
            System.out.println("pass");
            return true;
        }
        
        else{
            System.out.println("fail");
            return false;
        }
    }
    
     /**
     * inner event listener class - private.  This class handles GUI Events
     * 
     * ===Save Event Button===
     *  When the save event button is fired:
     *  -the eventTitle string is passed to checkStringLength with a min length of 3 and a max length of 20.  If the string fails this test, an error box
     *      is shown and the event title must be re-entered.
     *  -otherwise, the eventName is constructed from the event title, age and gender.
     *  -a new instance of Event is created within the instance of SportsDay, with the parameters eventName and eventUnit (which is either distance or time only).
     *  -the instance of Event is added to the arrayList of Events in SportsDay
     *  - the eventName is added to the select event combo boxes on the results tab and the add results tab.
     *  
     *  The event name is constructed in a way that produces a consistent naming format that does not need validating, apart from the string of event type -e.g. long jump.
     * 
     * ===Save Result Button===
     * When the save result button is fired:
     * -the fName and lName strings are passed to checkStringLength with a min length of 1 and a max length of 20.  If the string fails this test, an error box
     *      is shown and the event title must be re-entered.
     * -otherwise get the eventType String (time or distance)
     * if the eventType is distance:
     *      -get the values as type Number from the resultsFields 1,2 and 3 and convert the distance to Double metres e.g. 1.245 
     *      -add the result to the event as follows: sportsDay.addResult(eventName, fName, lName, totalDist).  This call the addResult method and creates a new competitor, with result
     *      in the arraylist of competitors for that particular instance of event
     *      This means that each event object has the results data stored within the instance of the event and so mixing up of results is very difficult.
     * if the eventType is time:
     *      -get the values as type Number from the resultsFields 1,2 and 3 and convert the distance to Double time in seconds e.g. 36.245 
     *      -add the result to the event as follows: sportsDay.addResult(eventName, fName, lName, totalTime).  This call the addResult method and creates a new competitor, with result
     *      in the arraylist of competitors for that particular instance of event
     *      This means that each event object has the results data stored within the instance of the event and so mixing up of results is very difficult.
     * 
     * ===selectEvent (from combo box on enter results tab)===
     * -get the eventName
     * -get the eventType
     * -if the eventType is distance, set the label visibility so that mins, sec's, thous are invisible and M, cm and mm are visible.  Set the spinnerNumberModel params appropriately.
     * -if the eventType is time, set the label visibility so that mins, sec's, thous are visible and M, cm and mm are invisible.  Set the spinnerNumberModel params appropriately.
     * This means that labels are set correctly.  An alternative would have been to have different alternative spinners for distance and time.  This may have involved more code.
     * Essentially all results are a Double - either metres or seconds.  This means that ordering results can be relatively simple.
     * 
     * ===viewResultsButton===
     * -get the eventName
     * -get the eventType
     * -get the event instance by name
     * - call the getResults() method of the event instance
     * - display the results in the textArea
     * 
     */
    
        private class EventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
           
        if(e.getSource() == saveEventButton){
        //Manipulate strings so that event objects can be named correctly
        //Events are named as follows:  u13girlshighjump; u15boys100m.  All lower case, no spaces.
        System.out.println("saveEventButton fired");
        
        String title = eventTitle.getText();
        Boolean test = checkStringLength(title,3,20);
        if (test == false){
           System.out.println("false part");
           JOptionPane.showMessageDialog(new JFrame(),
           "Error - event name needs to be between 3 and 20 characters in length",
           "Event Name Error",
           JOptionPane.ERROR_MESSAGE);

           eventTitle.setText("");}
        
        else{
        
        String eventName = ages.getSelectedItem().toString().toLowerCase();
        eventName = eventName + gender.getSelectedItem().toString().toLowerCase();
        eventName = eventName + eventTitle.getText().toLowerCase();
        //System.out.println(eventName);
        String eventUnit = unit.getSelectedItem().toString().toLowerCase();
        //System.out.println(eventUnit);
        sportsDay.createNewEvent(eventName, eventUnit);//Create a new event in the sportsDay object.
        selectEvent.addItem(eventName);
        selectResultsEvent.addItem(eventName);
    }
    }
    if(e.getSource() == saveResultButton){
        System.out.println("selectEvent combofired");
        String eventName = selectEvent.getSelectedItem().toString();
        String fName = competitorFirstName.getText();
        String lName = competitorLastName.getText();        
        Boolean testfName = checkStringLength(fName,1,30);
        Boolean testlName = checkStringLength(lName,1,30);
        
        if (testfName == false || testlName == false){
           System.out.println("false part");
           JOptionPane.showMessageDialog(new JFrame(),
           "Error - first and lastname needs to be between 1 and 30 characters in length each",
           "First Name Error",
           JOptionPane.ERROR_MESSAGE);

           eventTitle.setText("");}
        else{
        //String lName = competitorLastName.getText();
        Double totalDist;
        Double totalTime;
        String eventType = sportsDay.getEventType(eventName);
        System.out.println(eventType);
        if(eventType.equals("distance")){
            
            //input verification here?
            //String distance_M = resultField1.getText();
            Number distance_M = resultField1.getNumber();
            //Double distanceM = Double.parseDouble(distance_M);
            Double distanceM = distance_M.doubleValue();//double from spinnernumber
            //String distance_cm = resultField2.getText();
            Number distance_cm = resultField2.getNumber();
            //Double distancecm = Double.parseDouble(distance_cm);
            Double distancecm = distance_cm.doubleValue();//double from spinnernumber
            distancecm = distancecm * 0.01;
            
            Number distance_mm = resultField3.getNumber();
            //String distance_mm = resultField3.getText();
            //Double distancemm = Double.parseDouble(distance_mm);
            Double distancemm = distance_mm.doubleValue();//double from spinnernumber
            
            distancemm = distancemm * 0.001;
            totalDist = distanceM + distancecm + distancemm;//calculate the distance in metres
            System.out.println(totalDist);
            sportsDay.addResult(eventName, fName, lName, totalDist);
            System.out.println(eventName);//TESTING
            Event event = sportsDay.getEvent(eventName);//TESTING - get the event object
            event.getResults();//TESTING Print the results for that object to the console
    }
    if(eventType.equals("time")){
            //String time_M = resultField1.getText();
            Number time_M = resultField1.getNumber();
            //Double timeM = Double.parseDouble(time_M);
            Double timeM = time_M.doubleValue();
            timeM = timeM * 60;//convert mins to seconds
            //String time_sec = resultField2.getText();
            Number time_sec = resultField2.getNumber();
            //Double timesec = Double.parseDouble(time_sec);
            Double timesec = time_sec.doubleValue();
            //String time_millisec = resultField3.getText();
            Number time_millisec = resultField3.getNumber();
            Double timemillisec = time_millisec.doubleValue();
            
            //Double timemillisec = Double.parseDouble(time_millisec);
            timemillisec = timemillisec * 0.001;
            totalTime = timeM + timesec + timemillisec;// calculate time in seconds
            System.out.println(totalTime);
            sportsDay.addResult(eventName, fName, lName, totalTime);
    }
    }
    }
    if(e.getSource() == selectEvent){
        System.out.println("selectEvent combofired");
        String eventName = selectEvent.getSelectedItem().toString();
        String eventType = sportsDay.getEventType(eventName);
        System.out.println(eventType);
        if(eventType.equals("distance")){//.equals checks for value equality whereas == checks for is equal to - object.
            System.out.println("Distance selected, changing label visibility");
            minsLabel.setVisible(false);
            secsLabel.setVisible(false);
            msecsLabel.setVisible(false);
            metresLabel.setVisible(true);
            cmLabel.setVisible(true);
            mmLabel.setVisible(true);
            spinnerMax = 50;
            resultField1.setMaximum(spinnerMax);
            resultField1.setValue(0);
            spinnerMax = 99;
            resultField2.setMaximum(spinnerMax);
            resultField2.setValue(0);
            spinnerMax = 9;
            resultField3.setMaximum(spinnerMax);
            resultField3.setValue(0);
           }
        else if(eventType.equals("time")){
            System.out.println("Time selected, changing label visibility");
            minsLabel.setVisible(true);
            secsLabel.setVisible(true);
            msecsLabel.setVisible(true);
            metresLabel.setVisible(false);
            cmLabel.setVisible(false);
            mmLabel.setVisible(false);
            spinnerMax = 59;
            resultField1.setMaximum(spinnerMax);
            resultField1.setValue(0);
            resultField2.setMaximum(spinnerMax);
            resultField2.setValue(0);
            spinnerMax = 999;
            resultField3.setMaximum(spinnerMax);
            resultField3.setValue(0);
           }    
          }
    if(e.getSource() == viewResultsButton){
        System.out.println("viewResultsButton combofired");
        String eventName = selectResultsEvent.getSelectedItem().toString();
        String eventType = sportsDay.getEventType(eventName);
        Event event = sportsDay.getEvent(eventName);
        String results = event.getResults();
        
        System.out.println(results);
        textArea.setText(results);
        }
    }
        }
    
}
