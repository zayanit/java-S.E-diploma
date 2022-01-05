/*
(Vowel or consonant?) Write a program that prompts the user to enter a letter and 
check whether the letter is a vowel or consonant. For a nonletter input, display 
invalid input
*/
package exercise_4_13;

/**
 *
 * @author zayan
 */
import java.util.Scanner;

public class Exercise_4_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char character = input.next().charAt(0);

        /*String chars = "aeiouAEIOUbcdfghjklmpqrstvwxyzBCDFGHJKLMPQRSTVWXY";
        int position = chars.indexOf(character);
        if (position == -1) {
            System.out.println(character + " is an invalid input");
        } else {
            System.out.print(character);
            System.out.println((position <= 9) ? " is a vowel" : " is a consonant");
        }*/

        if (Character.isLetter(character)) {
            switch(Character.toUpperCase(character)) {
                case 'A': 
                case 'E': 
                case 'I': 
                case '0': 
                case 'U': System.out.println(character + " is a vowel"); break;
                default : System.out.println(character + " is a consonant"); 
            }
        } else {
            System.out.println(character + " is an invalid input");
        }
    }
    
}
