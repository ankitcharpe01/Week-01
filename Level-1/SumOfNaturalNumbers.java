import java.util.Scanner;

public class SumOfNaturalNumbers {
	//main function
    public static void main(String[] args) {
        // Creating a object of scanner class for user input
        Scanner input = new Scanner(System.in);

        // Taking number as user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking if the given number is a natural number and greater than or 
		//equal to zero
        if (number >= 0) {
            // Here we are considering 0 as a natural number
            // Calculating the sum of n natural numbers
            int sum = number * (number + 1) / 2;
			// print statement if the number is a natural number
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // print statement if the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
