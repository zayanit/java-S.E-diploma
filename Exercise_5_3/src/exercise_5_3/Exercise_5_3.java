/*
(Conversion from Cº to Fº) Write a program that displays the following table (note 
that farenheit = celsius * 9/5 + 32)
*/
package exercise_5_3;

/**
 *
 * @author zayan
 */
public class Exercise_5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double celsius, fahrenheit;
        System.out.println("Celsius   Fahrenheit");
        
        for (int count = 0; count <= 100; count += 2) {
            celsius = count;
            fahrenheit = celsius * 9 / 5 + 32;
            System.out.printf("%-3.0f%17.1f\n", celsius, fahrenheit);
        }
    }
    
}
