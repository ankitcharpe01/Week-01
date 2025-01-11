//import Scanner class
import java.util.Scanner;

public class SmallestNumber {
	//main function
    public static void main(String[] args) {

        // Create a scanner class for input
        Scanner input = new Scanner(System.in);

        // Taking three numbers as user input
        System.out.print("Enter First number: ");
        int number_1 = input.nextInt();
        System.out.print("Enter Second number: ");
        int number_2 = input.nextInt();
        System.out.print("Enter Third number: ");
        int number_3 = input.nextInt();
		
		//use conditional statements
        //  Check if the first is the smallest of the 3 numbers
        if (number_1 < number_2 && number_1 < number_3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}
