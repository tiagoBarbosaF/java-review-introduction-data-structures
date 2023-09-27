import java.util.Random;
import java.util.Scanner;

public class ChallengeDivination {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int randomNumber = new Random().nextInt(100);
        int chooseNumber = 0;
        int attempts = 0;

        System.out.println("Guess what the random number is.");
        while (attempts < 5) {
            System.out.print("Choose a number: ");
            chooseNumber = reader.nextInt();


            attempts++;

            if (chooseNumber > randomNumber) {
                System.out.printf("Your chosen number is GREATER than the " +
                        "random number.%nAttempt %d%n%n", attempts);
            } else if (chooseNumber < randomNumber) {
                System.out.printf("Your chosen number is SMALLER than the " +
                        "random number.%nAttempt %d%n%n", attempts);
            } else {
                System.out.printf("You won, you guessed the random number: " +
                        "%d%n", randomNumber);
                break;
            }

            if (attempts == 5){
                System.out.printf("You have run out of attempts, the random " +
                        "number is: %d%n%n", randomNumber);
            }
        }

        System.out.println("Game finished!!!");
    }
}
