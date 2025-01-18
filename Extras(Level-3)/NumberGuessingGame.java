import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lower = 1, upper = 100;
        int guess, userFeedback;

        System.out.println("Think of a number between 1 and 100. I will try to guess it.");

        do {
            guess = random.nextInt(upper - lower + 1) + lower;
            System.out.println("Is your number " + guess + "? (1: correct, 2: too high, 3: too low)");
            userFeedback = scanner.nextInt();

            if (userFeedback == 2) {
                upper = guess - 1;
            } else if (userFeedback == 3) {
                lower = guess + 1;
            }
        } while (userFeedback != 1);

        System.out.println("I guessed your number! It is " + guess);
    }
}