import java.util.*;
public class TotalPrice{
	public static void main(String[]args){
		//create variables for quantity 
		int quantity;
		//create Scanner Object to take user input
		Scanner sc = new Scanner(System.in);
		//Taking user input in unitPrice and quantity using Scanner Object
		System.out.println("Enter the unit price of an item : ");
		double unitPrice= sc.nextDouble();
		
		System.out.println("Enter the quantity to be bought : ");
		int quantityToBought= sc.nextInt();
		
		//calculate the totalQuantity
		double totalQuantity = unitPrice*quantityToBought;
		//print the total quantity
		System.out.println("The total quantity is: "+totalQuantity);
	}
}