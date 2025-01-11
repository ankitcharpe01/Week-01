//import Scanner class
import java.util.Scanner;

public class BonusOfEmployee{
	//main function
    public static void main(String[] args) {
	    //Creating a scanner class object
        Scanner input = new Scanner(System.in);
		
         // Take salary as input from user
		System.out.println("Enter your Salary: ");
		double salary = input.nextDouble();
		
		// Take Year of service as input from user
		System.out.println("Enter your  year of service: ");
		double yearOfService = input.nextDouble();
		
		double bonus=0.0;
		if(yearOfService>5){
		bonus = salary*((double)5/100);
		System.out.println("The Bonus amount of employee is: "+bonus);
		}else{
		System.out.println("The Bonus amount of employee is: "+bonus+" Because you give service of less than 5 years");
		}
		input.close();
	}
}
