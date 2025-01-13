//import Scanner class for taking inputs 
import java.util.Scanner;

public class PositiveNegativeAndZero{

   //method for calculating the number is positive , negative or zero
	public static int numberCheck(int number){
		//Calculate the number
		if(number==0){
			return 0;
		}else if(number > 0){
			return 1;
		}else if(number <0){
			return -1;
		}else{
		 System.out.println("Not a number ,Please Enter a Number!");
		}
		return 0;
	}
	
	
    //main function
	public static void main(String[]args){
	
	    //Creating Scanner class object
		Scanner input = new Scanner(System.in);
		
		//Create variable named number and take input from user
		System.out.println("Enter the number :");
		int number = input.nextInt();
		
		//Method called and get the outcome in result variable
		int resultingNumber = numberCheck(number);
		
		//print the output 
		if(resultingNumber==0){
			System.out.println("The number is Zero");
		}else if(resultingNumber ==1){
			System.out.println("The number is Positive");
		}else if(resultingNumber==-1){
			System.out.println("The number is Negative");
		}else{
			 System.out.println("Not a number ,Please Enter a Number!");
		}
	}
}