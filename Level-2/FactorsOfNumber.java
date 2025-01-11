//import Scanner class
import java.util.Scanner;

public class FactorsOfNumber {
	//main function
    public static void main(String[] args) {
	//create a scanner object
        Scanner input = new Scanner(System.in);
		
		//Taking number as user input 
        System.out.print("Enter a number : ");
        int number = input.nextInt();
		
        for (int i = 1; i < number; i++) {
		//check number is divisible
           if(number%i==0){
		   System.out.println("Yes the number is perfetly divisible by "+i);
		   }else{
		   System.out.println("No the number is not perfetly divisible by "+i);
		   }
        }
       input.close();
    }
}