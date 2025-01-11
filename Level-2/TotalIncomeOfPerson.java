//import Scanner class for taking inputs 
import java.util.Scanner;

public class TotalIncomeOfPerson{
    //main function
	public static void main(String[]args){
	
	    //Creating Scanner class object
		Scanner input = new Scanner(System.in);
		
		//Creating a variable named Salary and bonus
		double salary ,bonus;
		
		//Taking input salary and bonus from user
		System.out.println("Enter your Salary: ");
		salary = input.nextDouble();
		
		System.out.println("Enter your Bonus");
		bonus = input.nextDouble();
		
		//Comput total income by adding salary and bonus 
		double totalIncome =salary+bonus;
		
		//print total income of a person
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+" .Hence Total Income is INR "+totalIncome);
	}
}