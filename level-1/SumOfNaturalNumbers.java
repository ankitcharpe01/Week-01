import java.util.Scanner;

public class SumOfNaturalNumbers {
	
	//method for calculating sum of n natural numbers
    public static int sumOfNaturalNumbers(int number){
		int sum =0;
		for(int i=0 ; i<=number ;i++){
			sum+=i;
		}
		return sum;
	}
	
	//main function
    public static void main(String[] args) {
        // Creating a object of scanner class for user input
        Scanner input = new Scanner(System.in);

        // Taking number as user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		//Printing the output
        System.out.println("The of N natural numbers is : "+sumOfNaturalNumbers(number));
        
    }
}
