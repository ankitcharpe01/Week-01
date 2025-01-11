//import Scanner class
import java.util.Scanner;

public class GreatestFactorOfNumber {
    public static void main(String[] args) {
	//create a scanner object
        Scanner sc = new Scanner(System.in);
		
		//Taking number as user input 
        System.out.print("Enter a number");
        int number = sc.nextInt();
		
		//initialize greatestFactor to 1
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; 
            }
        }
        System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
    }
}