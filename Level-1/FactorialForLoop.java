//import Scanner class
import java.util.Scanner;

public class FactorialForLoop{
	//main function
    public static void main(String[] args) {
	    //Creating a scanner class object
        Scanner input = new Scanner(System.in);
         // Take a input from user
		System.out.println("Enter the Number: ");
		int number = input.nextInt();
		
		int factorial=1;
	    //Codition check for the natural number
		if(number>0){
		//compute factorial using for loop
		 for(int i=1 ;i<=number ;i++){
		  factorial=factorial*i;
		 }
		}
		//Print the computed factorial
        System.out.println("Factorial of the given number is:"+factorial);
		input.close();
    }
}
