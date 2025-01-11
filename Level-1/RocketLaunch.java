import java.util.Scanner;

public class RocketLaunch {
	//main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking countdown starting value as user input
        System.out.print("Countdown starting number: ");
        int counter = input.nextInt();

        // countdown Starting
        System.out.println("Starting the countdown:");
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrementing the counter
        }

        // Print the output statement
        System.out.println("Liftoff! Rocket has launched!");
    }
}
