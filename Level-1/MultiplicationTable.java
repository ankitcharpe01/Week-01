//import Scanner class
import java.util.Scanner;

public class MultiplicationTable{
	//main function
    public static void main(String[] args) {
	    //Creating a scanner class object
        Scanner input = new Scanner(System.in);
		
         // Take number as input from user
		System.out.println("Enter your number: ");
		int number = input.nextInt();
		
		//iterate for loop from 6 to 9
	    for(int i=6 ;i<=9 ;i++){
		 System.out.println(number +" * "+ i + " = "+ number*i );
		}
		input.close();
	}
}
