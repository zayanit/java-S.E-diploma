package monthdays;

import java.util.*;

public class MonthDays {

    public static void main(String[] args) {
        //inputes: year number (int), month name (String of 3 letters)
        //output: printed message ("31", "30", "28", "29" days)
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter month name (first 3 letters): ");
        String month = input.next();
        month = month.toLowerCase();
        //if (month.equalsIgnoreCase("jan") || month.equalsIgnoreCase("mar"))
        switch(month) {
            case "jan":
            case "mar":
            case "may":
            case "jul":
            case "aug":
            case "oct":
            case "dec":
                System.out.println("31 days");
                break;
            case "apr":
            case "jun":
            case "sep":
            case "nov":
                System.out.println("30 dayes");
                break;
            case "feb":
                System.out.println("Enter year number: ");
                int year = input.nextInt();
                if (year <= 0) {
                    System.out.println("Invalid year number");
                } else {
                    /*int days = (year % 4 == 0) ? 29 : 28;
                    System.out.println(days + " dayes");*/
                    System.out.println(((year % 4 == 0) ? 29 : 28) + " days");
                }
                break;
            default:
                System.out.println("Invalid month name");
        } 
    }
}
