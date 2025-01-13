//import Scanner class for taking inputs 
import java.util.Scanner;

public class RunInTriangularPark{

   //method for calculate rounds must teh athlete complete
	public static int computeRoundsToComplete(double totalDistance,double perimeter){
		//Calculate the number of rounds the athlete needs to complete rounds
		int roundsResult =(int)Math.ceil(totalDistance/perimeter);
		return roundsResult;
	}
	
	
    //main function
	public static void main(String[]args){
	
	    //Creating Scanner class object
		Scanner input = new Scanner(System.in);
		
		//input sides of the triangular park 
		System.out.println("Enter the length of side 1 in meter :");
		double side1 = input.nextDouble();
		
		System.out.println("Enter the length of side 2 in meter :");
		double side2 = input.nextDouble();
		
		System.out.println("Enter the length of side 3 in meter :");
		double side3 = input.nextDouble();
		
		//calculate the perimeter of the triangular park
		double perimeter = side1+side2+side3;
		
		//according to problem convert the 5km to meter
		double totalDistance =5*1000;
		
		//Method called and get the outcome in rounds variable
		int rounds = computeRoundsToComplete(totalDistance,perimeter);
		
		//print the output 
		System.out.println("The total numbers of rounds the athlete will run is : "+rounds+ " to complete 5 kms");
	}
}