import java.util.Scanner;

public class FactorsOfNumber {
	
	//Create a method to find the Factor of a number
	public static int[] findFactors(int number){
		
		//first loop for count the number of factor
		int count =0;
		for(int i=1 ;i<=number ;i++){
			if(number%i==0){
				count++;
			}
		}
		
		int factors[] = new int[count]; 
		int index=0;
		
		//second loop to store the factors in array
		for(int i=1 ;i<=number ;i++){
			if(number%i==0){
				factors[index]=i;
				index++;
			}
		}
		return factors;
	}
	
	//Create a method to calculate the sum of the factors using factor array
	public static int calculateSum(int []calSum){
		int sum =0;
		for(int number : calSum){
			sum = sum+number;
		}
		return sum;
	}
	
	//Create a method to calculate the sum of square of the factors using factor array
	public static int calculateSumOfSquare(int []calSumOfSq){
		int sumOfSquares =0;
		for(int number : calSumOfSq){
			sumOfSquares = sumOfSquares + (int)Math.pow(number,2);
		}
		return sumOfSquares;
	}
	
	//Create a method to calculate the Product of factors using factor array
	public static long calculateProducts(int []prodArr){
		long product =1;
		for(int number :prodArr){
			product =product* number;
		}
		return product;
	}
	
	//main Function
    public static void main(String[] args) {
	
		//creating a scanner class object
        Scanner sc = new Scanner(System.in);
		
		//Taking inputs from user
		System.out.println("Enter a number ");
		int number=sc.nextInt();
	    
		//find factor
		int factors[] = findFactors(number);
		
		//find sum , sum of square and product
		int sum = calculateSum(factors); //passed factors array as args
		int sumOfSquares = calculateSumOfSquare(factors);
		long product = calculateProducts(factors);
		
		// Print the Factors of number
        System.out.println("Factors of " + number + " is: " );
        for (int i=0;i<=factors.length-1;i++) {
            System.out.print(factors[i]+" ");
        }	
		
        System.out.println("\nSum of Factors is : "+sum);
        System.out.println("Sum of Square of Factors is : "+sumOfSquares);
        System.out.println("Product of Factors is : "+product);

		sc.close();
}
}