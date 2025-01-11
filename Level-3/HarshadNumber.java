//import Scanner class
import java.util.Scanner;

public class HarshadNumber {
	//main function
    public static void main(String[] args) {
	//create a scanner object
        Scanner input = new Scanner(System.in);
		
		//Taking number as user input 
        System.out.print("Enter a number : ");
        int number = input.nextInt();
		
		//Create an integer variable sum with initial value 0
		int sum =0;
		while(number!=0){
		//Remove the last digit of a integer value
		int Digit = number%10;
		// Add each digit of the number to sum
		sum = sum + Digit;
		//remaining number
		number=number/10;
		}
      //Print the count of integer value
	  if(number%sum==0){
	   System.out.print("The number is a Harshad's Number");
	  }else{
		  System.out.print("The number is Not a Harshad's Number");
	  }
	  //close the Scanner class
       input.close();
    }
}