//import Scanner class
import java.util.Scanner;

public class PositiveNegativeOrZero{
	//main function
    public static void main(String[] args) {
	    //Create a Scanner class object
        Scanner sc = new Scanner(System.in);
		
		//Declare an array and allocating memory in an array
		int number[] = new int[5];
		
		//Take user input and initializing the five numbers of array
		//first to last fifth element
		System.out.println("Enter any five numbers : ");
		for(int i=0; i<number.length ;i++){
			number[i] = sc.nextInt();
		}
		
		for(int i=0 ;i<number.length ;i++){
			//check the number is positive integer
			if(number[i]>0){
				//check the number is even or odd
				if(number[i]%2==0){
				 System.out.println("Number "+number[i]+" is Even number");
				}else{
				 System.out.println("Number "+number[i]+" is Odd number");
				}
			//set the condition if the number is negative then print the statement
			}else if(number[i]<0){
			System.out.println("The number "+number[i]+" is negative number");
			}else{
			System.out.println("The number is Zero");
			}
		}
		//compare first and last number to check whether the number is
		//positive, negative, or zero
		if(number[0]==number[number.length-1]){
			System.out.println("Both the numbers are equal!");
		}else if(number[0]>number[number.length-1]){
			System.out.println("The number of first element in an array is greater than the last element");
		}else{	
			System.out.println("The number of first element in an array is less than the last element");
		}
        sc.close();
    }
}