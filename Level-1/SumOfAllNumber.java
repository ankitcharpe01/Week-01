//import Scanner class
import java.util.Scanner;

public class SumOfAllNumber{
	//main function
    public static void main(String[] args) {
	    //Create a Scanner class object
        Scanner sc = new Scanner(System.in);

		//Declare an array and allocating memory in an array
		double values[] = new double[10];
		
		//initialize double to 0.0
		double total =0.0;
		//index variable is initialize to 0
		int index =0; 
		
		System.out.println("Enter numbers :");
		
		//use infinite while loop
		while(true){
		//Take input from user
		 int number = sc.nextInt();
	     
		 //check the number is zero or negative
		 if(number<=0 || index==10){
		   break;
		 }
		 
		 //if the number is not zero or negative then assign the number to array
	s	 values[index]=number;
		 //incementing the index
		 index++;
		}
		
		System.out.println("All the numbers are: ");
		for(int i=0; i<values.length ;i++){
		//calculating the sum of all values
		 total = total +values[i];
		//print all the elements stored in array
		 System.out.println(values[i]);
		}
		//Print the sum of all elements
		System.out.println("The sum of all numbers is: "+total);
		//closing of Scanner
        sc.close();
    }
}