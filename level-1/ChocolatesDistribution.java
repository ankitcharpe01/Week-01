//import Scanner class for taking inputs 
import java.util.Scanner;

public class ChocolatesDistribution{
	
	//create a method named chocolatesDistribution for find number of chocolates get each child 
	//and remaining chocolates
	public static int []chocolatesDistribution(int numberOfChocolates,int numberOfChildren){
	    //create resulting array 
		int resultArr[] = new int[2];
		
		//Compute the number of chocolates each child get and remaining chocolates
		int numberOfChocoGetEachChild = numberOfChocolates/numberOfChildren;
		resultArr[0]= numberOfChocoGetEachChild;
		int remainingChocolates = numberOfChocolates%numberOfChildren;
		resultArr[1] =remainingChocolates;
		
		return resultArr;
		
	} 
    //main function
	public static void main(String[]args){
	
	    //Creating Scanner class object
		Scanner input = new Scanner(System.in);
		
	    // create a variable numberOfChocolates and numberOfChildren 
		//and take an input from user
		System.out.println("Enter the number of Chocolates N: ");
		int numberOfChocolates = input.nextInt();
		
		System.out.println("Enter the number of Children M: ");
		int numberOfChildren = input.nextInt();
		
		int result[] = chocolatesDistribution(numberOfChocolates,numberOfChildren);
		//Display the result
		System.out.println("The number of chocolates each child gets is " +result[0] +
		" and the number of remaining chocolates are "+ result[1]);
	}
}