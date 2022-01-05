/*
(Palindrome integer) Write a program that prompts the user to enter a three-digit 
integer and determines whether it is a palindrome integer. An integer is palindrome 
if it reads the same from right to left and from left to right. A negative integer is 
treated the same as a positive integer.
*/
package exercise_3_12;

/**
 *
 * @author zayan
 */
import java.util.Scanner;

public class Exercise_3_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a three-digit integer: ");
        int originalNum = input.nextInt();
        
        int lastDigit = originalNum % 10;
        int firstDigit = originalNum / 100;
        
        System.out.print(originalNum);
        System.out.println(lastDigit == firstDigit ? " is a palindrome" : " is not a palindrome");
    }
    
}
