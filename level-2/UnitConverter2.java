//import Scanner Class
import java.util.Scanner;

public class UnitConverter2{
 
	//Method to Convert yards to feets
	 public static double convertYardToFeet(double yards){
		double yardToFeet = 3;
		double feet = yardToFeet*yards;
		return feet;
	 }
	 
	 //Method to Convert Feet to yard
	  public static double convertFeetToYard(double feet){
		double feetToYard =0.333333;
		double yards= feet*feetToYard;
		return yards;
	 }
	 
	 //Method to Convert meter to inches
	  public static double convertMeterToInches(double meters){
		double meterToinches = 39.3701;
		double inches= meters * meterToinches;
		return inches;
	 }
	 
	 //Method to Convert inches to meter
	  public static double convertInchesToMeter(double inches){
		double inchesToMeter = 0.0254;
		double meter =  inches*inchesToMeter;
		return meter;
	 }
	 
	 //Method to Convert inches to cm
	  public static double convertInchesToCentimeters(double inches){
		double inchesToCentimeters = 2.54;
		double centimeters =  inches*inchesToCentimeters;
		return centimeters;
	 }
	 
	 
     //main function
     public static void main(String []args){
	    // Declare an object and initialize with predefined standard input object
	    Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Operation :\n 1.Yard To Feet Conversion \n 2.Feet To Yard Conversion \n 3.Meters To Inches Conversion \n 4.Inches To Meter Conversion \n 5.Inches To Centimeter Conversion\n" );
		int operation = sc.nextInt();
		
		//choose conversion operation
		switch(operation){
		case 1:
			System.out.println("Enter Yards :");
			double yard =sc.nextDouble();
			double result1 = convertYardToFeet(yard);
			System.out.println("Distance in Feets: "+result1);
			break;
		case 2 : 
			System.out.println("Enter Feets :");
			double feet =sc.nextDouble();
			double result2 = convertFeetToYard(feet);
			System.out.println("Distance in Yard: "+result2);
			break;
		case 3 : 	
			System.out.println("Enter Meters :");
			double meter =sc.nextDouble();
			double result3 = convertMeterToInches(meter);
			System.out.println("Distance in Inches: "+result3);
			break;
		case 4 : 	
			System.out.println("Enter Inches :");
			double inches =sc.nextDouble();
			double result4 = convertInchesToMeter(inches);
			System.out.println("Distance in Meters: "+result4);
			break;
		case 5 : 	
			System.out.println("Enter Inches :");
		    inches =sc.nextDouble();
			double result5 = convertInchesToCentimeters(inches);
			System.out.println("Distance in Meters: "+result5);
			break;
		default :
		    System.out.println("Please! enter valid Operation 1 ,2 ,3 ,4 ,5 ??");
		}
		sc.close();
	 }
}