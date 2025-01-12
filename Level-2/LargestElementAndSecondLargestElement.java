import java.util.Scanner;

public class LargestElementAndSecondLargestElement {
    public static void main(String[] args) {
	
	//Create an Scanner object
        Scanner sc = new Scanner(System.in);
		
		//Take inputs
        System.out.println("Enter a number ");
        int number=sc.nextInt();
		
		//initialize maxDigit to 10 only
        int maxDigit =10;
        int index=0;		
		int digits[]=new int[maxDigit];
		int temp=number;
		
		//Remove the last digit from the number in each iteration and add it to the array
		while(number!=0){
			if(index <maxDigit){
				digits[index]=number%10;
			    number/=10;
				index++;
			}else{
				break;
			}
		}
		
		//Logic of find Largest and  second Largest
		int largest=0 , secondLargest=0;
		for(int i=0 ;i<digits.length;i++){
			if(digits[i]>largest){
				largest=digits[i];
			}
		}
		 for (int i = 0; i <digits.length; i++) {
            if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
       //Print the results of largest and secondLargest
        System.out.println("The Largest number is " + largest);
        System.out.println("The second Largest number is " + secondLargest);
    }
}   