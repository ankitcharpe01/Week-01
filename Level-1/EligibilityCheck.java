//import Scanner class
import java.util.Scanner;

public class EligibilityCheck {
	// main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking age as user input
        System.out.print("Enter the person's age: ");
        int age = input.nextInt();

        // Check if a person is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
