package switchstatementexample;
import java.util.Scanner;

public class SwitchStatementExample {

    
    public static void main(String[] args) {
        
        int month;
        String monthstring = null;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("What is the number of the month you were born in?");
        month = reader.nextInt();
        
        //switch statement
        switch (month){
            case 1: monthstring = "January";
                break;
            case 2: monthstring = "February";
                break;
            case 3: monthstring = "March";
                break;
            case 4: monthstring = "April";
                break;
            case 5: monthstring = "May";
                break;
            case 6: monthstring = "June";
                break;
            case 7: monthstring = "July";
                break;
            case 8: monthstring = "August";
                break;
            case 9: monthstring = "September";
                break;
            case 10: monthstring = "October";
                break;
            case 11: monthstring = "November";
                break;
            case 12: monthstring = "December";
                break;
            default: monthstring = ("You have commited an I-D-10-T Error.");
                break;
        }
        
        System.out.println("you typed in " + month + " the name of that month is: " + monthstring);
        
    }
    
}
