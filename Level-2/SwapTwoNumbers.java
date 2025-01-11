//import Scanner class for taking inputs 
import java.util.Scanner;

public class SwapTwoNumbers{
    //main function
	public static void main(String[]args){
	
	    //Creating Scanner class object
		Scanner input = new Scanner(System.in);
		
		//Create a variable number_1 and take user input
		System.out.println("Enter your first number : ");
		int number_1 = input.nextInt();
		
		//Create a variable number_2 and take user input
		System.out.println("Enter your Second number : ");
		int number_2 = input.nextInt();
		
		//create temporary variable named temp for swap two numbers.
		//swapping logic
		int temp = number_1;
		number_1 = number_2;
		number_2 = temp;
		
		//Print the swaped numbers
		System.out.println("The swapped numbers are "+number_1+" and "+number_2);
	}
}