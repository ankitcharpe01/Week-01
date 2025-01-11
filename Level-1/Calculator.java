import java.util.Scanner;
public class Calculator{
 //main function
   public static void main(String[] args){
   // Declare an object and initialize with predefined standard input object
	   Scanner sc= new Scanner(System.in);
	  //Taking inputs from user
	  System.out.println("Enter first number: ");
       double firstNumber=sc.nextDouble();
	   System.out.println("Enter second number: ");
       double secondNumber=sc.nextDouble();
	  //Calculations 
	   double add=firstNumber+secondNumber;
	   double sub=firstNumber-secondNumber;
	   double mul=firstNumber*secondNumber;
	   double div=firstNumber/secondNumber;
	  //Printing output 
       System.out.println("The addition is, subtraction, multiplication and division value of 2 numbers "+(firstNumber)+" and " + (secondNumber)+" is " + (add) + " , " + (sub) + " , " + (mul) + " and " +(div) );
	   
	  
   }
}