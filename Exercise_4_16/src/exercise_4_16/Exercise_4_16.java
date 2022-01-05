/*
(Random character) Write a program that displays a random lowercase letter using 
the Math.random() method.
*/
package exercise_4_16;

/**
 *
 * @author zayan
 */
public class Exercise_4_16 {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 26 + 97);
        char character = (char) randomNumber;
        System.out.println("The generated random lowercase letter is \"" + character + "\"");
    }
    
}
