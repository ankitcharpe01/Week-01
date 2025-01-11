//import Scanner class
import java.util.Scanner;

public class RocketLaunchUsingFor {
	//main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking  countdown starting number as user input
        System.out.print("Enter the countdown starting number: ");
        int counter = input.nextInt();

        // Countdown
        System.out.println("Starting the countdown:");
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Print Rocket launch Statement
        System.out.println("Liftoff! Rocket has launched!");
    }
}
