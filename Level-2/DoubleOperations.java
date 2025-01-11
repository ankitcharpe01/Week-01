//import Scanner class
import java.util.Scanner;

public class DoubleOperations{
    //main function
	public static void main(String[]args){
	    //Creating Scanner class object
		Scanner input = new Scanner(System.in);
		
		//Creating double Variables a , b, c and take a input
        double a ,b, c;  		
		
		//Enter First input value
		System.out.println("Enter first double value : ");
		a = input.nextDouble();
		
		//Enter Second Input value
		System.out.println("Enter second double value : ");
		b = input.nextDouble();
		
		//Enter Third Input value
		System.out.println("Enter third double value : ");
		c = input.nextDouble();
		
		//Perform operations
		double operation_1 = a+b*c;
		double operation_2 = a*b+c;
		double operation_3 = a%b+c;
		
		//Print DoubleOpt results
		//To reduce the precision we user explicit conversion
		System.out.println("The results of Double_Operations are "+(float)operation_1+" , "+(float)operation_2+" and "+(float)operation_3);
	}
}