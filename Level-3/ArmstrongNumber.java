//import Scanner class
import java.util.Scanner;

public class ArmstrongNumber {
	//main function
    public static void main(String[] args) {
	//create a scanner object
        Scanner input = new Scanner(System.in);
		
		//Taking number as user input 
        System.out.print("Enter a number : ");
        int number = input.nextInt();
		
		int sum =0;
		int originalNumber=number;
        while(originalNumber!=0){
		//find the remainder as a last digit of number
		int digit = originalNumber%10;
		//cube of the number and added to the sum variable
		sum =sum + (int)Math.pow(digit,3);
		// remaining digits of number
		originalNumber =originalNumber/10;
		}
		
		//compare and print the result
		if(number == sum){
		 System.out.print("Yes, the number is Armstrong Number");
		}else{
		 System.out.print("No, the number is Not an Armstrong Number");
		}
       input.close();
    }
}