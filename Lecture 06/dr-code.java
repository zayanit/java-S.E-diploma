package welcome;

import java.util.Scanner;

public class Welcome 
{
    public static void main(String[] args)
    {
        //inputs: year number (int) , month name (string of 3 letters)
        //outputs: printed message ("31" ,"30", "28", "29" days)
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter month name (first 3 letters): ");
        String month = input.next();
        
        month = month.toLowerCase();
        System.out.println(month);
        
        switch(month)
        {
            case "jan": case "mar": case "may": case "jul": case "aug": case "oct": 
            case "dec": System.out.println("31 days"); break;
                
            case "apr": case "jun": case "sep": case "nov": System.out.println("30 days"); break;
            
            case "feb": System.out.println("Enter year number: ");
                        int year = input.nextInt();
                        if(year <= 0)
                            System.out.println("invalid year <= 0");
                        else
                            System.out.println( ((year % 4 == 0) ? "29" : "28") + " days");
  
                        break;
            default:    
                        System.out.println("invalid month name");
        }
        
//        
        
//        
//        if(guess.length() != 2)
//        {
//            System.out.println("Error: guess must be 2-digit number");
//            return;
//        }
//        
//        if(lottery.equals(guess))
//            System.out.println("you win 10000$"); //76 == 76
//        else
//        {
//            //7 6
//            char leftLottery = lottery.charAt(0);
//            char rightLottery = lottery.charAt(1);
//            
//            // 6 7
//            char leftGuess = guess.charAt(0);
//            char rightGuess = guess.charAt(1);
//            
//            if(leftLottery == rightGuess && rightLottery == leftGuess)
//                System.out.println("you win 5000$");
//            
//            //76 -> 36 , ->72
//            else if(leftLottery == leftGuess || rightLottery == rightGuess)
//                System.out.println("you win 1000$");
//            
//            else
//                System.out.println("you lost");
//        }
//        
//        
//        
//        
//        
//   
//        
//       System.out.println();
//        
//        
//        
//        
//        
//        System.out.println();
        
        System.out.println();
    }
}
