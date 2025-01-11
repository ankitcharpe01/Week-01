//import scanner class
import java.util.Scanner;
public class HeightConversions{
//main function
   public static void main(String[] args){
   // Declare an object and initialize with predefined standard input object
	   Scanner sc= new Scanner(System.in);
	  //taking inputs from user
	  System.out.println("Enter your height in centimeters");
       int heightInCentimeters=sc.nextInt();
	  //Converting heights into inches and feet 
	   double heightInFeet=heightInCentimeters/2.54;
	   double heightInInces= heightInFeet/12;
	  //Printing output 
       System.out.println("Your height in cm is "+(heightInCentimeters)+" while in feet is " + (heightInFeet)+" and in inches is " + (heightInInces) + ".");
	  
   }
}