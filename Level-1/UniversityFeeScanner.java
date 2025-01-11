//import Scanner Class
import java.util.Scanner;
//Driver class
public class UniversityFeeScanner {
    //main Function
    public static void main(String[] args) {
	
		// Declare an object and initialize with predefined standard input object
	    Scanner sc= new Scanner(System.in);
		//Create a variable named fee and take user input for fee
		System.out.println("Enter your Fee : ");
        int fee = sc.nextInt();
		
		//Creating another variable discountPercent and take user input
		System.out.println("Enter your DiscountPercent: ")
        double discountPercentage = sc.nextDouble();
		//Compute the discount and assign it to the discount variable.
        double discount = (fee * (1/discountPercentage));
		//Compute and print the fee you have to pay by subtracting the discount from the fee
        double discountedFee = fee - discount ;
        System.out.println(" The discount amount is INR" + " " + discount + " " + "and final discounted fee is INR" + " " + discountedFee);

    }
}