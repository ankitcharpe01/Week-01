import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
	
	//Creating Scanner class object
        Scanner sc = new Scanner(System.in);
		//Take input from user
        System.out.println("Enter a number ");
        int number=sc.nextInt();
		
		//create temporary variables
		int temp1=number;
		int temp2=number;
		int countDigits=0;
		
		while(temp1!=0){
				countDigits++;
			    temp1/=10;
		}
		
		int reverseDigitArray[]=new int[countDigits];
		int index=0;
		while(temp2!=0){
				reverseDigitArray[index++]=temp2%10;
			    temp2/=10;
		}
		//Print the reversed digits
		 System.out.println("Reversed Digit is : ");
        for(int i=0;i<countDigits;i++){
			 System.out.print(reverseDigitArray[i]);
		}			
       sc.close();
    }
}