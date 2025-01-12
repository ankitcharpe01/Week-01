//import Scanner class
import java.util.Scanner;

public class MultiplicationTableNumbers{
	//main function
    public static void main(String[] args) {
	    //Create a Scanner class object
        Scanner sc = new Scanner(System.in);
		
		//Take input from user
	     System.out.println("Enter a number : ");
		 int number = sc.nextInt();
		 
		//Declare an array and allocating memory in an array
		int multiplicationResult[] = new int[4];
		
		//Computing result
		for(int i=6; i<=9 ;i++){
		multiplicationResult[i-6]=i*number;	
		}
		
		//Print the result of the multiplication format number*i=result
		System.out.println("The multiplication table of a "+number+" from 6 to 9");
		for(int i=6; i<=9 ;i++){
		System.out.println(number+" * "+i+" = "+multiplicationResult[i-6]);
		
		}
		
		//closing of Scanner
        sc.close();
    }
}