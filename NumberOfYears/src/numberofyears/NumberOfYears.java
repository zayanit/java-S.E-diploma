/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberofyears;

import java.util.Scanner;

public class NumberOfYears {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        
        long minutes = input.nextLong();
        long hours = minutes / 60;
        int days = (int) hours / 24;
        int years = days / 365;
        int remainingDays = days % 365;
        
        System.out.println(minutes + " minutes is approximately " + years + 
            " years and " + remainingDays + " days");
    }
    
}
