// To read data of various types we use Scanner class
//import Scanner class
import java.util.Scanner;

public class PoundsToKilogramsConversion{
    //main function
	public static void main(String[]args){
	
	    //Creating Scanner class object
		Scanner sc = new Scanner(System.in);
		
	    //Create a variable weight and take input from user
		System.out.println("Enter your weight in pounds :");
		double weightInPounds = sc .nextDouble();
		
		//Conversion of weight in pounds to kilograms
		double weightInKg = weightInPounds/2.2;
		
		//Print the result of conversion
		System.out.println("The weight of the person in pound is "+weightInPounds+ " and in kg is "+weightInKg);
	}
}