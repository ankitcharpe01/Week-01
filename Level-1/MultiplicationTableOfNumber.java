//import Scanner class
import java.util.Scanner;

public class MultiplicationTableOfNumber{
	//main function
    public static void main(String[] args) {
	    //Create a Scanner class object
        Scanner sc = new Scanner(System.in);
		
		//Take input from user
	     System.out.println("Enter a number : ");
		 int number = sc.nextInt();
		 
		//Declare an array and allocating memory in an array
		int result[] = new int[10];
		
		//Computing result
		for(int i=1; i<10 ;i++){
		result[i]=i*number;	
		}
		
		//Print the result of the multiplication format number*i=result
		for(int i=1; i<10 ;i++){
		System.out.println(number+" * "+i+" = "+result[i]);
		}
		
		//closing of Scanner
        sc.close();
    }
}