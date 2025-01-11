import java.util.Scanner;

public class SumOfNaturalCompareWithFor {
	//main function
    public static void main(String[] args) {
        // Creating a object of scanner class for user input
        Scanner input = new Scanner(System.in);

        // Taking number as user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
     
	    // create two variables to store sum using formula nad sum using for loop
        int sumUsingFormula =0;
		int sumUsingForLoop=0;
		 
        // Checking if the given number is a natural number and greater than or 
		//equal to zero
        if (number >= 0) {
            // Here we are considering 0 as a natural number
            // Calculating the sum of n natural numbers
             sumUsingFormula = number * (number + 1) / 2;
			// print statement if the number is a natural number
            System.out.println("The sum of " + number + " natural numbers is " + sumUsingFormula);
        } else {
            // print statement if the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
		
		//using for loop
		for(int i=1 ; i<=number ;i++){
		sumUsingForLoop +=i;
		}
		
		System.out.println("Sum using Formula:"+ sumUsingFormula);
		System.out.println("Sum using For Loop:"+ sumUsingForLoop);

		//compare both computations
		if(sumUsingFormula==sumUsingForLoop){
		System.out.println("Both computations was Correct");
		}else{
		System.out.println("Both computations was Not Correct");
		}
    }
}
