package welcome;

import java.util.Scanner;

public class Welcome 
{
    public static void main(String[] args)
    {
        // Tuition = 10000
        // Increase = 0.07
        // Tuition = Tuition + (Tuition * 0.07) = Tuition * (1 + 0.07) = Tuition * 1.07
        
        int years = 5;
        double Tuition = 10000;
        double Increase = 1.5;
        
        for(int i = 1 ; i <= years ; i++)
            Tuition *= Increase; // Tuition = Tuition * 1.07;
        
        System.out.println(Tuition);
            
        //-------------------------------------------------
        
        /*double sum = 0.01;
        
        for(int i = 1 ; i <= 100 ; i++)
            sum += 0.01;
        
        System.out.println(sum);
        
        if(sum == 1.0)
            System.out.println("sum reaches 1.0");*/
        
        //-------------------------------------------------
        
//        
//        //      *           line = 1    spaces = 3  stars = 1
//        //    * * *         line = 2    spaces = 2  stars = 3
//        //  * * * * *       line = 3    spaces = 1  stars = 5
//        //* * * * * * *     line = 4    spaces = 0  stars = 7
        /*int lines = 10;
        
        for(int L = 1 ; L <= lines ; L++) // outer (lines)
        {
            for(int s = 1 ; s <= lines-L ; s++) //inner (spaces)
                System.out.print(' ');
            
            for(int x = 1 ; x <= 2*L-1 ; x++) // inner (stars)
                System.out.print('*');
            
            System.out.println();
        }*/
        
        
        //-------------------------------------------------
        
//        //      1   2   3   4   5
//        //--------------------------
//        //1|    1   2   3   4   5
//        //2|    2   4   6   8   10
//        //3|    3   6   9   12  15
//        //4|    4   8   12  16  20
//        //5|    5   10  15  20  25
//        
        /*int val = 8;
        
        for(int i = 1 ; i <= val ; i++)  //      1   2   3   4   5
            System.out.print("\t" + i);
        
        System.out.println();
        
        for(int i = 1 ; i <= 65 ; i++) //--------------------------
            System.out.print('-');
        
        System.out.println();
        
        for(int i = 1 ; i <= val ; i++ ) // outer loop
        {
            System.out.print(i + "|\t");
            
            for(int j = 1 ; j <= val ; j++) // inner loop
            {
                System.out.print((i*j) + "\t");
            }
            
            System.out.println();
        }
        
        System.out.println();*/
        
        //-------------------------------------------------
        
        //inputs: unspecified number integer -> int variable (value)
        //outputs: sum of entered integers -> int variable (sum)
        
        /*Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer value: ");
        int value = input.nextInt();
        int sum = 0;*/
        
        /*do
        {
            sum += value;
            
            System.out.print("Enter an integer value: ");
            value = input.nextInt();
            
        } while(value != 0);*/
       
        /*while(value != 0)
        {
            sum += value;
            
            System.out.print("Enter an integer value: ");
            value = input.nextInt();
        }*/
        
        //System.out.println("\nSum = " + sum);
        
        //-------------------------------------------------
        /*//inputs: integer number (single int variable)
        //outputs: message ("too low" or "too high")
        
        Scanner input = new Scanner(System.in);
        
        int generated = (int)(Math.random()* 101);
        System.out.println(generated);
        
        System.out.print("Guesss integer number: ");
        int guess = input.nextInt();
        
        while(true)
        {
            if(generated == guess)
                break;
            
            else if (guess > generated)
                System.out.println("\nGuess is too high");
            else
                System.out.println("\nGuess is too low");    
            
            System.out.print("Guesss integer number: ");
            guess = input.nextInt();
        }
        
        System.out.println();*/
    }
}
