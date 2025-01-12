//import Scanner class
import java.util.Scanner;

public class FizzBuzz {
	//main function
    public static void main(String[] args) {
	    //Create a scanner object
        Scanner sc = new Scanner(System.in);
		
		
		//Take user input 
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		if(number<=0){
		System.out.println("Number is less than Zero please enter a positive integer: ");
		}
		//Define an Array
		String fizzBuzz[] = new String[number];
	    
		//logic
		for(int i=1 ;i<=number;i++){
			if(i%3==0 && i%5==0){
			fizzBuzz[i-1]="FizzBuzz";
			}else if(i%3==0){
			fizzBuzz[i-1]="Fizz";
			}else if(i%5==0){
			fizzBuzz[i-1]="Buzz";
			}else {
			 fizzBuzz[i-1]=String.valueOf(i);
			}
			
		}
		//Print the Result
		for(int i=1; i<=number ; i++){
		System.out.println("Position "+(i)+" = "+fizzBuzz[i-1]);
		}
        sc.close();
    }
}