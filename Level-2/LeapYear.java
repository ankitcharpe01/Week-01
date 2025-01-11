//import Scanner class
import java.util.Scanner;

public class LeapYear{
	//main function
    public static void main(String[] args) {
	    //Creating a scanner class object
        Scanner input = new Scanner(System.in);
		
         // Take a year as input 
		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		if(year>=1582){
		  if(year % 400==0){
		    System.out.println("The Year "+year+" is Leap Year");
		  }
		  else if(year%100==0){
		  	System.out.println("The Year "+year+" is a Not Leap Year");
		  }else if(year%4 ==0){
		    System.out.println("The Year "+year+" is Leap Year");		  
		  }else{
		    System.out.println("The Year "+year+" is Not a Leap Year");
		  }
		}
		System.out.println("Please Enter a valid Year according to Gregorian Calender");
		input.close();
	}
}
