/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculateinvestment;

import java.util.Scanner;

public class CalculateInvestment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investment_amount = input.nextDouble();
        
        System.out.print("Enter annual interest rate: ");
        double annual_interest_rate = input.nextDouble();
        annual_interest_rate /= 100;
        
        System.out.print("Enter number of years: ");
        int number_of_years = input.nextInt();
        
        double monthly_interest_rate = annual_interest_rate / 12;
        
        double futureInterestRate = investment_amount * Math.pow(1 + monthly_interest_rate, number_of_years * 12);
        
        System.out.println("Future investment value is: " + futureInterestRate);
    }
    
}