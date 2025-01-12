//import Scanner class
import java.util.Scanner;

public class FactorsOfNumber{
	//main function
    public static void main(String[] args) {
	    //Create a Scanner class object
        Scanner sc = new Scanner(System.in);
		
		//Take a natural number as input from user
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		//create an integer variable 
		int maxFactor=10;
		
		int factors[] = new int[maxFactor];
		
		//Check if the entered number is natural number
		if(number<=0){
		System.out.println("Please enter natural number greater than zero!");
		return;
		}
		
		//initialize array to store odd and even numbers 
		int[]oddNumbers = new int [number/2+1];
		int[]evenNumbers = new int [number/2+1];
		
		//Create index variables
		int oddIndex =0;
		int evenIndex=0;
		
		for(int i=0 ; i<=number ;i++){
			//check even or odd
			if(i%2==0){
				evenNumbers[evenIndex]=i;
				evenIndex++;
			}else{
				oddNumbers[oddIndex]=i;
				oddIndex++;
			}
		}
		
		//Print odd numbers
		System.out.println("Odd Numbers: ");
		for(int i=0; i<oddIndex;i++){
			System.out.println(oddNumbers[i]+" " );
		}
		System.out.println();
		
		//Print Even numbers
		System.out.println("Even Numbers: ");
		for(int i=0; i<evenIndex;i++){
			System.out.println(evenNumbers[i]+" " );
		}
		
		//close the scanner
		//to release the resource
        sc.close();
    }
}