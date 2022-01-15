package welcome;

import java.util.Scanner;

public class Welcome 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //test an integer is prime or not
        //inputs: an integer number (int)
        //outputs: printed word ("prime", "not prime")
        
        System.out.print("Enter number of primes: ");
        int all = input.nextInt();
 
        boolean notprime;
        int printed = 1;
        int counter = 1;
        
        for(int num = 2 ; printed <= all ; num++)
        {
 
            notprime = false;
            for(int i = 2 ; (i <= Math.sqrt(num)) ; i++)
            {
                if(num%i == 0)
                {
                    notprime = true;
                    break;
                }
            }
            counter++;
            
            //System.out.print("\n" + counter + "\t");
            
            if(notprime == false) // if(! notprime)
            {
                if((printed - 1) % 10 == 0)
                    System.out.println();
                
                printed++; 
                
                System.out.print(num + "\t");
                 
            }
        }
        
        System.out.println("\n\nIterations#: " + counter);
        System.out.println("\nPrimes#: " + (printed - 1));
        
//        if(i >= Math.sqrt(num))
//            System.out.println("\nprime");
//        else
//            System.out.println("\nnot prime");
            
     
    //-------------------------------------------------------------
        //inputs: one string (String)
        //ouputs: one word ("plainrome" or "not palindrome")
        
        /*System.out.print("Enter your string: ");
        
        String str = input.next();
        
        //dad, noon, mom, 12321 -> plaindrome
        //      1       2           3           2           1 
        //  str[0]      str[1]      str[2]      str[3]      str[4]
        //        i         j
        // if(str[0] == str[4])
        // if(str[1] == str[3])
        // if(str[2] == str[2])
        
        // i= 0 -> increase to half of str.length()/2
        // j= str.length()-1 -> decrease to str.length()/2
        // if( str.charAt(i) == str.charAt(j) )
        
        int j;
        int i;
        
        for(i=0 , j=str.length()-1 ; i<=j ; i++ , j--)
        {
            if(str.charAt(i) != str.charAt(j))
                break;   
        }
        if(i>j)
            System.out.println("\npalindrome");
        else
            System.out.println("\nnon-palindrome");*/
  
        
        System.out.println();
    }
}
