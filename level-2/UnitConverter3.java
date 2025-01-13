//import Scanner Class
import java.util.Scanner;

public class UnitConverter3{
 
	//Method to Convert fahrenheit to celcius
	 public static double convertFahrenheitToCelcius(double fahrenheit){
		double celcius = (fahrenheit-32)*5/9;
		return celcius;
	 }
	 
	 //Method to Convert celcius to fahrenheit
	  public static double convertFeetToYard(double celcius){
		double fahrenheit=(celcius*9/5)+32;
		return fahrenheit;
	 }
	 
	 //Method to Convert pound to kilogram
	  public static double convertPoundToKilogram(double pounds){
		double kilograms = pounds* 0.453592;
		return kilograms;
	 }
	 
	 //Method to Convert kilogram to pound
	  public static double convertKilogramToPound(double kilograms){
		double pounds = kilograms*2.20462;
		return pounds;
	 }
	 
	 //Method to Convert gallon to liter
	  public static double convertGallonToLiter(double gallon){
		double liters = gallon*3.78541;
		return liters;
	 }
	 
	  //Method to Convert liter to gallon
	  public static double convertGallonToLiter(double liters){
		double gallons = liters*0.264172;
		return gallons;
	 }
	 

}