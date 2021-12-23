package lecture06;

import java.util.*;

public class Lecture06 {

    public static void main(String[] args) {
        //System.out.println("windows!");

        /*int x = 5;

        if (x < 1 & ++x > 0) {
            // && lazy AND , & short-circuit AND
            // || lazy OR , | short-circuit OR
            System.out.println("good");
        }*/

        /*String str = "Welcome To Java To";
        //System.out.println(str.charAt(3));
        //System.out.println(str.indexOf('c'));
        //System.out.println(str.indexOf('o', 6 ));
        System.out.println(str.lastIndexOf("To"));*/

        /*String str = "Ahmed Ali Maher";
        int x = str.indexOf(' ');
        String firstName = str.substring(0, x);
        int y = str.lastIndexOf(' ');
        String middleName = str.substring(x + 1, y);
        String lastName = str.substring(y + 1);
        System.out.println("First name is: " + firstName);
        System.out.println("Middle name is: " + middleName);
        System.out.println("Last name is: " + lastName);*/

        Scanner input = new Scanner(System.in);

        /*String str = input.next();
        System.out.println(str + 2);
        double value = Double.parseDouble(str);
        System.out.println(value);
        System.out.println(value + 2);*/

        /*String str = input.next();
        int k = str.indexOf('.');
        String integerPart = str.substring(0, k);
        String fractionPart = str.substring(++k);

        System.out.println(integerPart);
        System.out.println(fractionPart);

        int ivalue = Integer.parseInt(integerPart);
        System.out.println(ivalue);

        int fvalue = Integer.parseInt(fractionPart);
        System.out.println(fvalue);*/
        
        /*System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "cosine", "Tangent");
        //System.out.printf("%10s%10s%10s%10s%10s\n", "Degrees", "Radians", "Sine", "cosine", "Tangent");
        
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
        
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));*/   
    }
}
