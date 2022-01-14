/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computecylindervolume;

import java.util.Scanner;

public class ComputeCylinderVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius and length of a cylinder:");
        
        double radius = input.nextDouble();
        double length = input.nextDouble();
        
        // double area = radius * radius * 3.14
        double area = Math.pow(radius, 2) * Math.PI;
        double volume = area * length;
        
        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
    } 
}
