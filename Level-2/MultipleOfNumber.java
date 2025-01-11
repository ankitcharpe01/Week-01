//import Scanner class
import java.util.Scanner;

public class MultipleOfNumber {
	//main function
    public static void main(String[] args) {
	//create a scanner object
        Scanner input = new Scanner(System.in);
		
		//Taking number as user input 
        System.out.print("Enter a number : ");
        int number = input.nextInt();
		
		
	     System.out.println("The multiple of a given number is: ");
		
        for (int i = 100; i>=1; i--) {
		//check number is divisible
           if(number%i==0){
		   System.out.println(i);
		   continue;
         }
		}
       input.close();
    }
}