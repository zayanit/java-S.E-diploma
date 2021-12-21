/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromenumber;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int digit1 = (int)(number / 100);
        int remaining = number % 100;
        int digit3 = (int)(remaining % 10);

        System.out.println(
                number + ((digit1 == digit3) ? " is a " : " is not a ") + "palindrome");
    }
    
}
