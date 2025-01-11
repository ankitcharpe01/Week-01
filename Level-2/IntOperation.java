//import Scanner class
import java.util.Scanner;

public class IntOperation{
    //main function
	public static void main(String[]args){
	    //Creating Scanner class object
		Scanner input = new Scanner(System.in);
		
		//Creating Integer Variables a , b, c and take a input
        int a ,b, c;  		
		
		//Enter First input value
		System.out.println("Enter first integer value : ");
		a = input.nextInt();
		
		//Enter Second Input value
		System.out.println("Enter second integer value : ");
		b = input.nextInt();
		
		//Enter Third Input value
		System.out.println("Enter third integer value : ");
		c = input.nextInt();
		
		//Perform operations
		int operation_1 = a+b*c;
		int operation_2 = a*b+c;
		int operation_3 = a%b+c;
		
		//Print output
		System.out.println("The results of Int Operations are "+operation_1+" , "+operation_2+" and "+operation_3);
	}
}