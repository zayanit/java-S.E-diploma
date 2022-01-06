/*
(Reverse a string) Write a program that prompts the user to enter a string and 
displays the string in reverse order.
*/
package exercise_5_46;

/**
 *
 * @author zayan
 */
import java.util.Scanner;

public class Exercise_5_46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        String str = input.next();
        String reverse_str = "";

        for (int i = str.length() - 1; i >= 0; i--) 
            reverse_str += str.charAt(i);
        
        System.out.println("The reversed string is: \"" + reverse_str + "\"");
    }
    
}
