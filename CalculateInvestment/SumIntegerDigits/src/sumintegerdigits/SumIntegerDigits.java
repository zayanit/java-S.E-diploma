/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumintegerdigits;

import java.util.Scanner;

public class SumIntegerDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        
        int number = input.nextInt();
        
        int sum = number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        
        System.out.println("The Sum is: " + sum);
        
    }
}
