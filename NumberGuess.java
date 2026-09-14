import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(10) + 1; // number between 1 and 10
        int guess = 0;
        int attempts = 0;

        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("Can you guess it?");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");

            if (!input.hasNext()) {
                System.out.println("\nInput ended. Thanks for playing!");
                break;
            }

            if (!input.hasNextInt()) {
                System.out.println("That is not a valid number. Please enter a whole number between 1 and 10.");
                input.next();
                continue;
            }

            guess = input.nextInt();

            if (guess < 1 || guess > 10) {
                System.out.println("Your guess must be between 1 and 10.");
                continue;
            }

            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You got it in " + attempts + " tries.");
            }
        }

        input.close();
    }
}