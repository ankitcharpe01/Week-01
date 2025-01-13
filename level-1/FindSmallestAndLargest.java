import java.util.Scanner;

public class FindSmallestAndLargest {
	
	//method for calculating sum of n natural numbers
   public static int[] findSmallestAndLargest(int number1, int number2, int number3){
			
			int result[] = new int[2];
			int smallest = Math.min(number1 ,Math.min(number2,number3));
			result[0]=smallest;
			int largest = Math.max(number1,Math.max(number2 ,number3));
			result[1]=largest;
			return result;
	}
	
	//main function
    public static void main(String[] args) {
        // Creating a object of scanner class for user input
        Scanner input = new Scanner(System.in);

        // Taking number as user input
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
        int number2 = input.nextInt();
		
		System.out.print("Enter third number: ");
        int number3 = input.nextInt();
		
		int result [] =findSmallestAndLargest(number1, number2, number3);
		//Printing the output
        System.out.println("The Smallest Number is "+result[0]+" and the Largest number is "+result[1]+ " among 3 numbers" );
        
    }
}
