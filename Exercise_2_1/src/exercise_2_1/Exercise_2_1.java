/*
(Convert mile to kilometer) Write a program that reads a mile in a double value 
from the console, converts it to kilometers, and displays the result. The formula 
for the conversion is as follows:
 1 mile = 1.6 kilometers
*/
package exercise_2_1;

/**
 *
 * @author zayan
 */

import java.util.Scanner;

public class Exercise_2_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double KILOMETERS_PER_MILE = 1.6;

        System.out.print("Enter a number in miles: ");
        double miles = input.nextDouble();

        double kilometers = miles * KILOMETERS_PER_MILE;

        System.out.println(miles + " miles is " + kilometers + " kilometers");
    }
    
}
