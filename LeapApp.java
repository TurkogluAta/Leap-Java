/*
 * LeapApp.java
 * @author: Ata Turkoglu
 * Date: 28/02/2023
 */

import javax.swing.JOptionPane;
public class LeapApp{
    public static void main(String args[]){
        //Declare variables
        int year;
        String message;

        //Declare objects
        Leap myLeap;

        //Create objects
        myLeap = new Leap();

        //Input
        year = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a year:"));
        myLeap.setYear(year);

        //Process
        myLeap.compute();

        //Output
        message = myLeap.getMessage();
        JOptionPane.showMessageDialog(null,message);
    }
}
