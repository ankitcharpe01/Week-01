//import Scanner class
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        // Creating a scanner class object for user input
        Scanner input = new Scanner(System.in);

        // Taking first number input as user input
        System.out.print("first number: ");
        int number1 = input.nextInt();
		// Taking second number input as user input
        System.out.print("second number: ");
        int number2 = input.nextInt();
		// Taking second number input as user input
        System.out.print("third number: ");
        int number3 = input.nextInt();

        // Check whether the number is largest among all numbers
        boolean isFirstLargest = (number1 >= number2 && number1 >= number3);
        boolean isSecondLargest = (number2 >= number1 && number2 >= number3);
        boolean isThirdLargest = (number3 >= number1 && number3 >= number2);

        // Print the number is largest or not
        System.out.println("Is the First number the largest? " + (isFirstLargest ? "Yes" : "No"));
        System.out.println("Is the Second number the largest? " + (isSecondLargest ? "Yes" : "No"));
        System.out.println("Is the Third number the largest? " + (isThirdLargest ? "Yes" : "No"));
    }
}
