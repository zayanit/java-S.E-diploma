/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmethodoverloading;

/**
 *
 * @author zayan
 */
public class TestMethodOverloading {

    public static void main(String[] args) {
    // Invoke the max method with int parameters
        System.out.println("The maximum of 3 and 4 is "
            + max(3, 4));

        // Invoke the max method with the double parameters
        System.out.println("The maximum of 3.0 and 5.4 is "
            + max(3.0, 5.4));

        // Invoke the max method with three double parameters
        System.out.println("The maximum of 3.0, 5.4, and 10.14 is "
            + max(3.0, 5.4, 10.14));
    }

    /** Return the max of two int values */
    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /** Find the max of two double values */
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /** Return the max of three double values */
    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }

}
