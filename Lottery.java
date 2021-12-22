import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        //inputs: guess 2-gihit numbers (String)
        //outputs: printed message "You win 10000, 5000 or 1000 $"
        //processing variables: random 2-digit lottery number (String)
        
        int lottery = 10 + (int)(Math.random() * 90);
        //System.out.println(lottery);

        System.out.println("Enter your guess: ");
        int guess = new Scanner(System.in).nextInt();

        if (guess < 10 || guess > 99) {
            System.out.println("Error: guess must be 2-digit number");
            return; 
        }

        if (guess == lottery) {
            System.out.println("You win 10000$");
        } else {
            int leftLottery = lottery / 10;
            int rightLottery = lottery % 10;

            int leftGuess = guess / 10;
            int rightGuess = guess % 10;

            if (leftLottery == rightGuess && rightLottery == leftGuess) {
                System.out.println("You win 5000$");
            } else if (leftLottery == leftGuess || leftLottery == rightGuess 
                || rightLottery == leftGuess || rightLottery == rightGuess) {
                System.out.println("You win 1000$");
            } else {
                System.out.println("You lost");
            }
        }
    }
}
