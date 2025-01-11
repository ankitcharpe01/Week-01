//import Scanner class
import java.util.Scanner;

public class AbundantNumber {
	//main function
    public static void main(String[] args) {
	//create a scanner object
        Scanner input = new Scanner(System.in);
		
		//Taking number as user input 
        System.out.print("Enter a number : ");
        int number = input.nextInt();
		
		//Create an integer variable sum with initial value 0
		int sum =0;
		
		for(int i=1 ; i<number ;i++){
		//if the number is diviible by i , add to th sum variable
		 if(number%i==0){
		  sum+=i;
		 }
		}
		
      //Compare the sum to the number
	  //if it is greater than so the number is AbundantNumber
	  if(sum>number){
	   System.out.print("The number is Abundant Number");
	  }else{
		  System.out.print("The number is Not Abundant Number");
	  }
	  //close the Scanner class
       input.close();
    }
}