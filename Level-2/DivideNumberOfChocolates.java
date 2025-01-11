//import Scanner class for taking inputs 
import java.util.Scanner;

public class DivideNumberOfChocolates{
    //main function
	public static void main(String[]args){
	
	    //Creating Scanner class object
		Scanner input = new Scanner(System.in);
		
	    // create a variable numberOfChocolates and numberOfChildren 
		//and take an input from user
		System.out.println("Enter the number of Chocolates N: ");
		int numberOfChocolates = input.nextInt();
		
		System.out.println("Enter the number of Children M: ");
		int numberOfChildren = input.nextInt();
		
		//Compute the number of chocolates each child get and remaining chocolates
		int numberOfChocoGetEachChild = numberOfChocolates/numberOfChildren;
		int remainingChocolates = numberOfChocolates%numberOfChildren;
		
		//Display the result
		System.out.println("The number of chocolates each child gets is " +numberOfChocoGetEachChild +
		" and the number of remaining chocolates are "+ remainingChocolates);
	}
}