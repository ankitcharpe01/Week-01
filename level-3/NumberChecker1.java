import java.util.Scanner;

public class NumberChecker1{
	
	//method for count digits in number
	public static int countOfDigits(int number){
		int count =0;
		while(number>0){
			count++;
			number=number/10;
		}
		return count;
	}
	
	
	//methos for store digits in array
	public static int[] digitsArray(int number){
		int count = countOfDigits(number);
		int digits[] = new int[count];
		for(int i=count-1; i>=0 ;i--){
				int rem = number%10;
				number/=10;
				digits[i]=rem;
		}
		return digits;
	}
	
	
	//method for check the number is duck using the digits array
	public static boolean isDuckNumber(int []digitsArray){
	  boolean flag = false;
		for(int i=0 ;i<digitsArray.length ;i++){
			if(digitsArray[i]!=0){
				flag=true;
			}else{
				flag=false;
			}
		}
		return flag;
	}
	
	//Method for check the number is armstrong or not
	public static boolean isArmstrong(int number){
		int sum =0;
		int originalNumber=number;
        while(originalNumber!=0){
		int digit = originalNumber%10;
		//cube of the number and added to the sum variable
		sum =sum + (int)Math.pow(digit,3);
		// remaining digits of number
		originalNumber =originalNumber/10;
		}
		if(number == sum){
			return true;
		}else{
			return false;
		}
	}
	
	//create a method to find largest and secondlargest of digitsArray
	public static int[] largestAndSecondLargest(int []digitsArray){
		int largest = Integer.MIN_VALUE;
		int secondlargest= Integer.MIN_VALUE;
		int largestArr[] = new int[2];
		for(int i=0 ; i< digitsArray.length ;i++ ){
			if(largest<digitsArray[i]){
				secondlargest=largest;
				largest=digitsArray[i];
			}
			if(digitsArray[i]<largest&&secondlargest>digitsArray[i]){
			secondlargest=digitsArray[i];
			}
		}
		largestArr[0]=largest;
		largestArr[1]=secondlargest;
		return largestArr;
	}
	
	//create a method to find samllest and secondSmallest of digitsArray
	public static int[] smallestAndSecondSmallest(int []digitsArray){
		int smallest = Integer.MAX_VALUE;
		int secondSmallest= Integer.MAX_VALUE;
		int smallestArr[] = new int[2];
		for(int i=0 ; i< digitsArray.length ;i++ ){
			if(smallest>digitsArray[i]){
				secondSmallest=smallest;
				smallest=digitsArray[i];
			}
			if(digitsArray[i]>smallest&&secondSmallest>digitsArray[i]){
			secondSmallest=digitsArray[i];
			}
		}
		smallestArr[0]=smallest;
		smallestArr[1]=secondSmallest;
		return smallestArr;
	}
	//main method
    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
		int number = sc.nextInt();
		
		int count = countOfDigits(number);
		int digitsArray[]= digitsArray(number);
		boolean duckNumber= isDuckNumber(digitsArray);
		boolean armstrong =isArmstrong(number);
		int largestSecondLargest[] = largestAndSecondLargest(digitsArray);
		int smallestSecondSmallest[] = smallestAndSecondSmallest(digitsArray);
		System.out.println("The total count of number is :"+count);
		
		System.out.println("The Elements in Digit Array is :");
		for(int i=0 ;i<digitsArray.length ;i++){
			System.out.println(digitsArray[i]);
		}
		if(duckNumber){
			System.out.println("Yes! It is a Duck Number");
		}else{
			System.out.println("No! It is not a Duck Number");		
		}
		
		if(armstrong){
			System.out.println("Yes! It is a Armstrong Number");
		}else{
			System.out.println("No! It is Not a Armstrong Nummber");		
		}
		
		System.out.println("The Largest Element in Digit Array is :"+largestSecondLargest[0]);
		System.out.println("The Second Largest Element in Digit Array is :"+largestSecondLargest[1]);
		
		System.out.println("The Smallest Element in Digit Array is :"+smallestSecondSmallest[0]);
		System.out.println("The Second Smallest Element in Digit Array is :"+smallestSecondSmallest[1]);
        sc.close();
    }
}