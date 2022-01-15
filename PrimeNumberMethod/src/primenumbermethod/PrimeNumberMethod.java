/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumbermethod;

/**
 *
 * @author zayan
 */
import java.util.*;

public class PrimeNumberMethod {

    public static void main(String[] args)
    {  
        Scanner input = new Scanner(System.in);

        int all, perline, stop;

        do
        {
            System.out.print("Enter number of primes: ");
            all = input.nextInt();

            System.out.print("Enter number of primes per line: ");
            perline = input.nextInt();

            PrintPrimes(all,perline); //call (invoke)

            System.out.print("\nrun again? enter 0 to stop: ");
            stop = input.nextInt();

        } while (stop != 0);
    }

    public static void PrintPrimes(int desiredPrimes, int desiredPerLine) //header
    {

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

    public static boolean isPrime(int num)
    {
        for(int i = 2 ; (i <= Math.sqrt(num)) ; i++)
        {
            if(num % i == 0)
                return false;
        }

        return true;
    }
    
}
