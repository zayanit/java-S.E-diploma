/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalstudy;

/**
 *
 * @author zayan
 */
import java.util.*;

public class FinalStudy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Widening a type can be performed automatically without explicit casting. Narrowing a type must be performed explicitly.
        /*int x = 3;
        
        double y = x;
        
        
        System.out.println(y);
        
        float f = 2.6f;*/
        
        /*char ch = 'a';
        System.out.println(++ch);*/
        
        //System.out.println("Welcome".charAt(2));
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.next();
        char ch = s.charAt(0);
        System.out.println(s);
    }
    
}
