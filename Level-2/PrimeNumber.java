import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking number as user Input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Boolean variable to check if the number is prime
        boolean isPrime = true;

        // Check if the number is greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
			//Initializing i from 2
            for (int i = 2; i <= number / 2; i++) {
                // Check if the number is divisible by i
                if (number % i == 0) {
                    isPrime = false;
					 // Not a prime number
                    break; 
                }
            }
        }

        // Check annd Print the number is prime or not 
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        input.close();
    }
}