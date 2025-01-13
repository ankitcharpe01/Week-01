import java.util.Scanner;

public class SumOfNaturalNumber {
	
	//Create a method to find the Sum of N natural number
	public static int calculateSumRecursion(int number){
		if(number==1){
			return 1;
		}
		// calculate sum using recursion
			number = number+calculateSumRecursion(number-1);
		return number;
	}
	
	//Create a method to calculate the sum of n natural number using formula
	public static int calculateSumFormula(int number){
		int sumUsingFormula =number * (number+1)/2;
		return sumUsingFormula;
	}
	
	
	//main Function
    public static void main(String[] args) {
	
		//creating a scanner class object
        Scanner sc = new Scanner(System.in);
		
		//Taking inputs from user
		System.out.println("Enter a number : ");
		int number=sc.nextInt();
	    
		//find sum using recursion and formula
		int recursionSum = calculateSumRecursion(number); 
		int formulaSum = calculateSumFormula(number);
		
		
        System.out.println("Sum of n natural number using recursion is : "+recursionSum);
        System.out.println("Sum of n natural number using formula is : "+formulaSum);
	
		if(recursionSum==formulaSum){
			System.out.println("Both method produce the same result");
		}else{
			System.out.println("Both method produce the diffrent result");			
		}
		sc.close();
}
}