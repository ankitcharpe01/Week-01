//import Scanner class for taking inputs 
import java.util.Scanner;

public class SimpleInterest{
    //main function
	public static void main(String[]args){
	
	    //Creating Scanner class object
		Scanner sc = new Scanner(System.in);
		
	    //Create Variables named Principal ,Rate and Time 
		float principal, rate, time;
		
		//Take input Principal value from user
		System.out.println("Enter Principal: ");
		principal = sc.nextFloat();
		
		//Take input Rate value from user
		System.out.println("Enter Rate: ");
		rate = sc.nextFloat();
		
		//Take input Time from user
		System.out.println("Enter Time: ");
		time = sc.nextFloat();
		
		/*Calculating Simple Interest*/
		float simpleInterest = (principal*time*rate)/100;
		System.out.println("Simple Interest = "+ simpleInterest);

	}
}