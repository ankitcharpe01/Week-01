//import Scanner class
import java.util.Scanner;

public class SumUntilEnteredZero {
	//main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
		 //Create a variable total to sum of number if the user not entered zero 
		 double total = 0.0;	
		//while loop to check if the user entered is 0.
		 while(true){
		 
		 //Take input from user in every condition 
		 System.out.println("Enter the number");
		 double number = input.nextDouble();
		 // check if the number is zero
		 if(number==0){
		 break;
		 }
		 else{
		 total +=number;
		}
	}
        // Print the total sum
        System.out.println("Total value:"+total);
		input.close();
    }
}
