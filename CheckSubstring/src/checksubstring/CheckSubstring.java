package checksubstring;

import java.util.*;

public class CheckSubstring {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String string1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String string2 = input.nextLine();

        System.out.println(
            string2 + ((string1.contains(string2)) ? " is " : " is not ") + 
            "a substring of " + string1);
    }
    
}
