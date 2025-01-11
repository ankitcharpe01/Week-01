//import Scanner class
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
	//create a scanner object
        Scanner sc = new Scanner(System.in);
		
		//Taking number as user input 
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
		
		//Taking number as user input 
        System.out.print("Enter a number");
        int power = sc.nextInt();
		
		int result =1;
        for (int i = 1; i <= power; i++) {
           result =result*number;
        }
        System.out.println("The power of " + power+ "is :"+result);
    }
}