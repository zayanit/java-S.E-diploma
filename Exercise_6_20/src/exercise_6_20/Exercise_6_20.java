/*
(Count the letters in a string) Write a method that counts the number of letters in 
a string using the following header:
public static int countLetters(String s)
Write a test program that prompts the user to enter a string and displays the number of letters in the string.
*/
package exercise_6_20;

/**
 *
 * @author zayan
 */
import java.util.Scanner;

public class Exercise_6_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        System.out.println("The number of letters: " + countLetters(str));
    }
    
    public static int countLetters(String s) {
        int letterCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                letterCount++;
        }
        
        return letterCount;
    }
    
}
