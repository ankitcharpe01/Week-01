//import Scanner class for taking inputs 
import java.util.Scanner;

public class TemperatureConversion{
    //main function
	public static void main(String[]args){
	    //Creating Scanner class object
		Scanner input = new Scanner(System.in);
		
		//creating a celsius variable and take the temperature as user input
		System.out.println("Enter the temperature in Celsius : ");
		double temperature_In_Celsius = input.nextDouble();
		
		//Convert Celsius to fahrenheit
		//using formula : (degree_Celsius * 9/5)+32=degree_Fahrenheit
		
		double temperature_In_Fahrenheit = (temperature_In_Celsius*9/5)+32;
		//print convertion of temperature in Celsius to fahrenheit 
		System.out.println("The "+temperature_In_Celsius+" celsius is "+temperature_In_Fahrenheit+" fahrenheit.");
	}
}
