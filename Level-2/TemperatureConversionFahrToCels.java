//import Scanner class for taking inputs 
import java.util.Scanner;

public class TemperatureConversionFahrToCels{
    //main function
	public static void main(String[]args){
	    //Creating Scanner class object
		Scanner input = new Scanner(System.in);
		
		//creating a fahrenheit variable and take the user's input
		System.out.println("Enter the temperature in Fahrenheit : ");
		double temperature_In_Fahrenheit = input.nextDouble();
		
		//Convert temperature Fahrenheit to Celsius
		//using formula : (degree_Fahrenheit-32)*5/9=degree_Celsius
		
		double temperature_In_Celsius = (temperature_In_Fahrenheit-32)*5/9;
		//print convertion of temperature in fahrenheit to celsius 
		System.out.println("The "+temperature_In_Fahrenheit+" fahrenheit is "+temperature_In_Celsius+" celsius");
	}
}
