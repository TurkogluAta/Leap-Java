/*
 * Leap.java
 * @author: Ata Turkoglu
 * Date: 28/02/2023
 */

public class Leap{
    //Declare data members
    private int year;
    private String message;

    //Constructor
    public Leap(){
        year = 0;
        message = "";
    }

    //Setters - One for every input
    public void setYear(int year){
        this.year=year;
    }

    //Compute method(s)
    public void compute(){
        if(year%400==0){
            message="This is a leap year.";
        }
        else{
            message="This is not a leap year."; 
        }
    }
    //Getter - One for every output
    public String getMessage(){
        return message;
    }
}

