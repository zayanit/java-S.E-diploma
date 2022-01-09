/*
(Multiply the digits in an integer) Write a program that reads an integer between 
0 and 1000 and multiplies all the digits in the integer. For example, if an integer 
is 932, the multiplication of all its digits is 54.
 Hint: Use the % operator to extract digits, and use the / operator to remove the 
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93
*/
package exercise_2_6;

/**
 *
 * @author zayan
 */
import java.util.Scanner;

public class Exercise_2_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer number between 0 and 1000: ");
        int initialNumber = input.nextInt();
        
        if (initialNumber > 1000 || initialNumber < 0) {
            System.out.println("Out of range!");
            System.out.println("Number should be between 0 & 1000!");
        } else {
            int number, multiplication;
            
            number = initialNumber;
            multiplication = number % 10;
            
            number /= 10;
            multiplication *= number % 10;
            number /= 10;
            multiplication *= number % 10;

            System.out.println("Multiplication of the digits in the number "
                    + initialNumber + " equals to " + multiplication);
        }
    }
}
