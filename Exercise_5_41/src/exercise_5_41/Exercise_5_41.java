/*
(Occurrence of max numbers) Write a program that reads integers, finds the largest 
of them, and counts its occurrences. Assume the input ends with number 0. 
Suppose you entered 3 5 2 5 5 5 0; the program finds that the largest is 5 and the 
occurrence count for 5 is 4.
(Hint: Maintain two variables, max and count. max stores the current max number 
and count stores its occurrences. Initially, assign the first number to max and 1 to 
count. Compare each subsequent number with max. If the number is greater than 
max, assign it to max and reset count to 1. If the number is equal to max, increment 
count by 1.)
*/
package exercise_5_41;

/**
 *
 * @author zayan
 */
import java.util.Scanner;

public class Exercise_5_41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer numbers ends with number 0: ");

        int next = input.nextInt();
        int max = next;
        int count = 1;

        while (next != 0) {
            next = input.nextInt();
            if (next > max) {
                max = next;
                count = 1;
            } else if (next == max) {
                count++;
            }
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
    
}
