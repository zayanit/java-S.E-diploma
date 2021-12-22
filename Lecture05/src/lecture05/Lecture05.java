package lecture05;

import java.util.Scanner;

public class Lecture05 {

    public static void main(String[] args) {
        /*double x = Math.random();
        x *= 11;
        
        System.out.println(x);
        System.out.println(Math.floor(x));
        System.out.println((int)x);*/
        
        /*char ch = 'a';
        System.out.println(ch);
        System.out.println(++ch);
        System.out.println((int)ch);
        System.out.println((char)100);*/
        
        /*System.out.println(Character.isLetter('&'));
        System.out.println(Character.isLetter('r'));*/
        
        /*char x = 'h';
        
        if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z')) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }*/
        
        /*String x = "hello java!";
        System.out.println(x.concat(" it is my best language!!"));*/
        
        Scanner input = new Scanner(System.in);
        /*//String x = input.next();
        String x = input.nextLine();
        System.out.println(x);*/
        
        /*String y = input.next();
        char a = y.charAt(0);
        System.out.println(a);*/
        
        /*char x = input.next().charAt(0);
        System.out.println(x);*/
        
        // check valid name (only carachters allowed)
        String x = input.nextLine();
        x = x.trim();
        if (x.isEmpty()) {
            System.out.println("\nEmpty input");
        }
        
        if (!x.matches("^[A-Za-z]+$")) {
            System.out.println("\nInput mismatch");
        }
        /*if (x.isEmpty() || !x.matches("[A-Za-z]")) {
            System.out.println("\nInput mismatch");
        } else {
            System.out.println("valid input");
        }*/
    }
    
}
