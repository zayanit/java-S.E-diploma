/*
(Occurrences of a specified character) Write a method that finds the number of 
occurrences of a specified character in a string using the following header:
public static int count(String str, char a)

For example, count("Welcome", 'e') returns 2. Write a test program that 
prompts the user to enter a string followed by a character then displays the number 
of occurrences of the character in the string.
*/
package exercise_6_23;

/**
 *
 * @author zayan
 */
import java.util.Scanner;

public class Exercise_6_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        System.out.println("The number of occurrences of " + ch + " in " + str + " is " + count(str, ch));
    }
    
    public static int count(String str, char a) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a)
                count++;
        }
        
        return count;
    }
    
}
