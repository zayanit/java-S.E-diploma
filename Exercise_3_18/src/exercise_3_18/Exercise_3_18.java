/*
(Cost of shipping) A shipping company uses the following function to calculate the 
cost (in dollars) of shipping based on the weight of the package (in pounds).

c(w) = 
        2.5, if 0 < w <= 2
        4.5, if 2 < w <= 4
        7.5, if 4 < w <= 10
        10.5, if 10 < w <= 20

Write a program that prompts the user to enter the weight of the package and 
display the shipping cost. If the weight is greater than 20, display a message “the 
package cannot be shipped.”
*/

package exercise_3_18;

/**
 *
 * @author zayan
 */
import java.util.Scanner;

public class Exercise_3_18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        double weight = input.nextDouble();
        
        if (weight <= 0) {
            System.out.println("Not a right weight!");
        } else if (weight > 20) {
            System.out.println("The package cannot be shipped.");
        } else {
            double shippingCost; 
            
            if (weight <= 2) {
                shippingCost = 2.5;
            } else if (weight <= 4) {
                shippingCost = 4.5;
            } else if (weight <= 10) {
                shippingCost = 7.5;
            } else { //if (weight <= 20)
                shippingCost = 10.5;
            }
            
            System.out.println("Shipping cost of package is $" + shippingCost);
        }
    }
    
}
