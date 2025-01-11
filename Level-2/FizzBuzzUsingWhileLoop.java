//import Scanner class
import java.util.Scanner;

public class FizzBuzzUsingWhileLoop{
	//main function
    public static void main(String[] args) {
	    //Creating a scanner class object
        Scanner input = new Scanner(System.in);
		
         // Take a number as input 
		System.out.println("Enter number: ");
		int number = input.nextInt();
		 
		 int i=1;
		//check the number is positive integer
		if(number>0){
		while(i<=number){
		
		//print FizzBuzz if the number is multiple of 3  and 5 
		  if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
		//print Fizz if the number is multiple of 3	
				else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
		//print Buzz if the number is multiple of 5 		
				else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
			i++;
		 }
        } else {
            System.out.println("Is not a positive integer.");
	}
	input.close();
}
}
