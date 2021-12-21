/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loanpayments;

import java.util.Scanner;

public class LoanPayments {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        annualInterestRate /= 100;
        
        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();
        
        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();
              
        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {
            System.out.println("Error you've entered wrong values.");
        } else {
            double monthlyInterestRate = annualInterestRate / 12;
            double numerator = loanAmount * monthlyInterestRate;
            
            int numberOfMonths = numberOfYears * 12;
            double domerator = 1 - 1 / Math.pow((1 + monthlyInterestRate), numberOfMonths);
            
            double monthlyPayment = numerator / domerator;
            System.out.println("You should pay monthly: " + monthlyPayment);
            
            double totalPayment = monthlyPayment * numberOfMonths;
            System.out.println("You should pay total: " + totalPayment);
        }
    }
    
}
