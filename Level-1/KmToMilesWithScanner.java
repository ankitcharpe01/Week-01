//import Scanner Class
import java.util.Scanner;
//Driver class
public class KmToMilesWithScanner{
     //main function
     public static void main(String []args){
	    // Declare an object and initialize with predefined standard input object
	    Scanner sc= new Scanner(System.in);
		//creating variable named kilometers and assign value
		double kilometers =sc.nextDouble();
		//converting the distance of 10.8 kilometers to miles
		double miles =kilometers*1.6;
		//print the total miles
		System.out.println("The total miles is "+miles+" mile for the given "+kilometers+" km");
	 }
}