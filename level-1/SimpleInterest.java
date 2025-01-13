//import Scanner class for taking inputs 
import java.util.Scanner;

public class SimpleInterest{

 //method for calculating Simple Interest 
	public static void simpleInterest(float principal ,float rate ,float time){
	    float simpleInterest = (principal*time*rate)/100;
		System.out.println("Simple Interest is "+ simpleInterest+ " for Principal"
	+principal+" ,Rate of Interest "+rate+" and Time "+time);
	}


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
		
		/*Call Simple Interest method*/
		
		SimpleInterest.simpleInterest(principal,rate,time);
	}
}