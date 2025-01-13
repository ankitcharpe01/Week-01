//import Scanner Class
import java.util.Scanner;

public class UnitConvertor{
 
	//Convert Km to miles
	 public static double convertKmToMiles(double kilometers){
		double kmToMiles = 0.621371;
		double miles = kilometers*kmToMiles;
		return miles;
	 }
	 
	 //Convert Miles to km
	  public static double convertMileToKm(double miles){
		double milesToKm =1.60934;
		double km = miles*milesToKm;
		return km;
	 }
	 
	 //Convert Meters to feet
	  public static double convertMetersToFeet(double meters){
		double meterToFeet = 3.28084;
		double feet= meters * meterToFeet;
		return feet;
	 }
	 
	 //Convert Feet to meters
	  public static double convertFeetToMeters(double feet){
		double feetToMeter = 3.28084;
		double meter =  feet*feetToMeter;
		return meter;
	 }
	 
     //main function
     public static void main(String []args){
	    // Declare an object and initialize with predefined standard input object
	    Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Operation :\n 1.Kilometer to Miles Conversion \n 2.Miles To kilometer Conversion \n 3.Meters To Feet Conversion \n 4.Feets To Meter Conversion\n" );
		int operation = sc.nextInt();
		
		//choose conversion operation
		switch(operation){
		case 1:
			System.out.println("Enter Kilometers :");
			double kilometers =sc.nextDouble();
			double result1 = convertKmToMiles(kilometers);
			System.out.println("Distance in Miles: "+result1);
			break;
		case 2 : 
			System.out.println("Enter Miles :");
			double miles =sc.nextDouble();
			double result2 = convertMileToKm(miles);
			System.out.println("Distance in kilometers: "+result2);
			break;
		case 3 : 	
			System.out.println("Enter Meters :");
			double meter =sc.nextDouble();
			double result3 = convertMetersToFeet(meter);
			System.out.println("Distance in feet: "+result3);
			break;
		case 4 : 	
			System.out.println("Enter Feets :");
			double feet =sc.nextDouble();
			double result4 = convertFeetToMeters(feet);
			System.out.println("Distance in meters: "+result4);
			break;
		default :
		    System.out.println("Please! enter valid Distance.");
		}
		sc.close();
	 }
}