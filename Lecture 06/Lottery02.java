import java.util.Scanner;

public class Lottery02 {
    public static void main(String[] args) {
        //inputs: guess 2-gihit numbers (String)
        //outputs: printed message "You win 10000, 5000 or 1000 $"
        //processing variables: random 2-digit lottery number (String)

        String lottery = (((int)Math.random() * 9) + 1) + "" 
            + (((int)Math.random() * 9) + 1);
        System.out.println(lottery);

        System.out.println("Enter your guess: ");
        String guess = new Scanner(System.in).next();

        if (guess.length() != 2) {
            System.out.println("Error: guess must be 2-digit number");
            return;
        }

        //if (Integer.parseInt(guess) == Integer.parseInt(lottery)) {
        if (lottery.equals(guess)) {
            System.out.println("You win 10000$");
        } else {
            char leftLottery = lottery.charAt(0);
            char rightLottery = lottery.charAt(1);

            char leftGuess = guess.charAt(0);
            char rightGuess = guess.charAt(1);

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
