/*
(Display patterns) Write a method to display a pattern as follows:
1 
1 2 
1 2 3 
...
n n−1 ... 3 2 1
The method header is
public static void displayPattern(int n)
*/
package exercise_6_6;

/**
 *
 * @author zayan
 */
import java.util.Scanner;

public class Exercise_6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        displayPattern(number);
    }
    
    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.printf(j + " ");
            }
            
            System.out.println();
        }
    }
    
}
