/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feettometers;

import java.util.Scanner;

public class FeetToMeters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double METERS_PER_FOOT = 0.305;

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meters = feet * METERS_PER_FOOT;

        System.out.println(feet + " feet is " + meters + " meters");
    }
    
}
