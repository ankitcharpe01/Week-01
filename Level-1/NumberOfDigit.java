//import Scanner class
import java.util.Scanner;

public class NumberOfDigit {
	//main function
    public static void main(String[] args) {
	//create a scanner object
        Scanner input = new Scanner(System.in);
		
		//Taking number as user input 
        System.out.print("Enter a number : ");
        int number = input.nextInt();
		
		int originalNumber =number;
		int count =0;
		while(number!=0){
		int removeDigit = number%10;
		originalNumber=originalNumber/10;
		count++;
		}
      
	   System.out.print("The number of digit in an integer is: "+count);
       input.close();
    }
}