import java.util.*;

public class QuotientAndRemainder{
	
	//Create method gor calculating quotient and remainder
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int resultingArray[] = new int [2];
		
		//calculating quotient and remainder
		int quotient = number/divisor;
		resultingArray[0]=quotient;
		
		int remainder = number%divisor;
		resultingArray[1]=remainder;
		
		return resultingArray;
	}
    //main function
	public static void main(String[]args){
	    //Creating Scanner class object
		Scanner input = new Scanner(System.in);
		
		//Enter first input named number1
		System.out.println("Enter Number : ");
		int number = input.nextInt();
		
		//Enter Second input named number2
		System.out.println("Enter divisor : ");
		int divisor = input.nextInt();
		
		int result[] = findRemainderAndQuotient(number ,divisor);
		
		//Print their quotient and remainder
		System.out.println("The Quotient is "+result[0]+" and Remainder is "+result[1]);
	}
}