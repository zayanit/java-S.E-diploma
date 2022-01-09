/*
(Cost of driving) Write a program that prompts the user to enter the distance to 
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon 
then displays the cost of the trip.
*/
package exercise_2_23;

/**
 *
 * @author zayan
 */
import java.util.Scanner;

public class Exercise_2_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();
        
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double cost = drivingDistance / milesPerGallon * pricePerGallon;
        System.out.println("The cost of driving is $" + cost);
    }
    
}
