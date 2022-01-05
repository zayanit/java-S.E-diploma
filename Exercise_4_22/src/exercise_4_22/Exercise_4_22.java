/*
(Check substring) Write a program that prompts the user to enter two strings, and 
reports whether the second string is a substring of the first string.
*/
package exercise_4_22;

/**
 *
 * @author zayan
 */
import java.util.Scanner;

public class Exercise_4_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter string s1: ");
        String str1 = input.nextLine();
        
        System.out.print("Enter string s2: ");
        String str2 = input.nextLine();

        System.out.println(str1.contains(str2) ? (str2 + " is a substring of " + str1) : (str2 + " is not a substring of " + str1));
    }
    
}
