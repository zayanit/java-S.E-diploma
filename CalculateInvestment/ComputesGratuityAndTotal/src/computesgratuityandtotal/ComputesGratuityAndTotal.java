/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computesgratuityandtotal;

import java.util.Scanner;

public class ComputesGratuityAndTotal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the subtotal and a gratuity rate: ");
        
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
    
}
