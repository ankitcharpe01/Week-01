//import Scanner class
import java.util.Scanner;

public class EvenOddBetweenOneToN{
	//main function
    public static void main(String[] args) {
	    //Creating a scanner class object
        Scanner input = new Scanner(System.in);
         // Take a input from user
		System.out.println("Enter the Number: ");
		int number = input.nextInt();
		
		//using for loop for iteration i=1 to that number you have entered
		 for(int i=1 ;i<=number ;i++){
		  //Check wheather the number is even or odd
		    if(i%2==0){  //condition for even
			 System.out.println("The number "+i+" is an Even Number");
			}else{
			 System.out.println("The number "+i+" is an Odd Number");
			}
		 }
		input.close();
    }
}
