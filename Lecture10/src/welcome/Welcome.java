package welcome;

import java.util.Scanner;

public class Welcome 
{
    public static boolean isPrime(int num)
    {
        for(int i = 2 ; (i <= Math.sqrt(num)) ; i++)
        {
            if(num % i == 0)
                return false;
        }
        
        return true;
    }
   
    //definition
    public static void PrintPrimes(int desiredPrimes, int desiredPerLine) //header
    { //body
       
        int printed = 1;
        int counter = 1;
        
        for(int num = 2 ; printed <= desiredPrimes ; num++)
        {
            counter++;
               
            if( isPrime(num) == true ) // if( isPrime(num) )
            {
                if((printed - 1) % desiredPerLine == 0)
                    System.out.println();
                
                printed++;
                
                System.out.print(num + "\t");  
            }
            
        }
        
        System.out.println("\n\nIterations#: " + counter);
        System.out.println("\nPrimes#: " + (printed - 1));
    }
    
    public static void test(int x) //overloaded
    {
        System.out.println("first single int");
    }
    
    public static void test(int x, int y) // overloaded
    {
        System.out.println("second two int");
    }
    
    public static void test(double w,double z) //overloaded
    {
        System.out.println("third two double");
    }
    
    public static void main(String[] args)
    {
//        test(6,7.5);   
        
        Scanner input = new Scanner(System.in);

        int all, perline, stop;
        
//        System.out.println( isPrime(35) );
        
        do
        {
            System.out.print("Enter number of primes: ");
            all = input.nextInt();

            System.out.print("Enter number of primes per line: ");
            perline = input.nextInt();

            PrintPrimes(all,perline); //call (invoke)
            
            System.out.print("\nrun again? enter 0 to stop: ");
            stop = input.nextInt();
            
        }while(stop != 0);
    //-------------------------------------------------------------
        //inputs: one string (String)
        //ouputs: one word ("plainrome" or "not palindrome")
        
//        System.out.print("Enter your string: ");
//        
//        String str = input.next();
//        
//        //dad, noon, mom, 12321 -> plaindrome
//        //      1       2           3           2           1 
//        //  str[0]      str[1]      str[2]      str[3]      str[4]
//        //        i         j
//        // if(str[0] == str[4])
//        // if(str[1] == str[3])
//        // if(str[2] == str[2])
//        
//        // i= 0 -> increase to half of str.length()/2
//        // j= str.length()-1 -> decrease to str.length()/2
//        // if( str.charAt(i) == str.charAt(j) )
//        
//        int j;
//        int i;
//        
//        for(i=0 , j=str.length()-1 ; i<=j ; i++ , j--)
//        {
//            if(str.charAt(i) != str.charAt(j))
//                break;   
//        }
//        if(i>j)
//            System.out.println("\npalindrome");
//        else
//            System.out.println("\nnon-palindrome");
  
        
        System.out.println();
    }
}
