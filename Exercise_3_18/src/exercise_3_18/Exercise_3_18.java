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

        if (weight > 20) {
            System.out.println("The package cannot be shipped.");
        } else {
            double costPerPound; 
            
            if (weight > 0 && weight <= 2) {
                costPerPound = 2.5;
            } else if (weight <= 4) {
                costPerPound = 4.5;
            } else if (weight <= 10) {
                costPerPound = 7.5;
            } else { //if (weight <= 20)
                costPerPound = 10.5;
            }
            
            System.out.println("Shipping cost of package is $" + costPerPound);
        }
    }
    
}
