/*
Write a program that prompts the user to enter two positive 
integers and finds their greatest common divisor.
*/
package greatestcommondivisor;

/**
 *
 * @author zayan
 */
import java.util.Scanner;

public class GreatestCommonDivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        
        int gcd = 1;
        int k = 2; // Possible gcd
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) 
                gcd = k;
            k++;
        }
        
        System.out.println("The greatest common divisor for " + n1 + 
             " and " + n2 + " is " + gcd);
    }
    
}
