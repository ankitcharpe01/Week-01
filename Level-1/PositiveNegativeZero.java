import java.util.Scanner;

public class PositiveNegativeZero {
	//main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking number as user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking if number is negative, positive or zero and print it 
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
