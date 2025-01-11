import java.util.*;

public class QuotientAndRemainder{
    //main function
	public static void main(String[]args){
	    //Creating Scanner class object
		Scanner input = new Scanner(System.in);
		
		//Enter first input named number1
		System.out.println("Enter First Number : ");
		int number1 = input.nextInt();
		
		//Enter Second input named number2
		System.out.println("Enter Second Number : ");
		int number2 = input.nextInt();
		
		//calculating quotient and remainder
		int quotient = number1/number2;
		int remainder = number1%number2;
		
		//Print their quotient and remainder
		System.out.println("The Quotient is "+quotient+" and Remainder is "+remainder+" of two number "+number1+" and "+number2);
	}
}