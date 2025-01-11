//import Scanner class
import java.util.Scanner;

public class Factorial{
	//main function
    public static void main(String[] args) {
	    //Creating a scanner class object
        Scanner input = new Scanner(System.in);
         // Take a input from user
		 System.out.println("Enter the Number: ");
		int number = input.nextInt();
		
		int factorial=1;
		int i=1;
		//Compute the factorial
		while(i<=number){
		 factorial = factorial*i;
		 i++;
		}
		//Print the computed factorial
        System.out.println("Factorial of the given number is:"+factorial);
		input.close();
    }
}
