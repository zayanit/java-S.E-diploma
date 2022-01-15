/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopadditionquiz;

/**
 *
 * @author zayan
 */
        
import java.util.Scanner;
        
public class LoopAdditionQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
 
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");

        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            
            answer = input.nextInt();
        }
        
        System.out.println("You got it!");
    }
    
}
