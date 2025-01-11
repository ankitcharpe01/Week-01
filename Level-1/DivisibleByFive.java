//import Scanner class 
import java.util.Scanner;

public class DivisibleByFive{
    //main function
	public static void main(String[]args){
	
	    //Creating Scanner class object
		Scanner input = new Scanner(System.in);
		
		// Take a number as input 
		System.out.println("Enter the number : ");
		int number = input.nextInt();
		
		//Check if the number is divisible by five
		if(number%5==0){
		 System.out.println("Is the number"+number+"divisible by 5? Yes");
		}else{
		System.out.println("Is the number"+number+"divisible by 5? No");
		}
		//Close the scanner
		input.close();
	}
}