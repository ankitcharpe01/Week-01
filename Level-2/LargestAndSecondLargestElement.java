import java.util.Scanner;

public class LargestAndSecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        long number=sc.nextLong();
        int maxDigit =10;
        int index=0;		
		int digits[]=new int[maxDigit];
		long temp=number;
		
		while(number!=0){
			 int digit = (int)number % 10;
             if (index == maxDigit) {
                maxDigit += 10;
                int[] tempArray = new int[maxDigit];
            for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i];
                }
             digits = tempArray;
            }
            digits[index++] = digit;
            number /= 10;
        }	
		
		//Find Largest and SecondLargest
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
    
        System.out.println("The Largest number is " + largest);
        System.out.println("The second Largest number is " + secondLargest);
    }
}