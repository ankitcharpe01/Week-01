//import Scanner class
import java.util.Scanner;

public class LeapYearOrNot{
	//main function
    public static void main(String[] args) {
	    //Creating a scanner class object
        Scanner input = new Scanner(System.in);
		
         // Take a year as input 
		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		//check the year condition
		if(year>=1582){
		
		//check the year is leap year or not using logical && and || operator 
		  if(year % 4==0 && year%100!=0 || year%400==0){
		  
		  //print the statement of the year is leap year
		    System.out.println("The Year "+year+" is Leap Year");
		  }else{
		   //print the statement of the year is notleap year
		    System.out.println("The Year "+year+" is Not a Leap Year");
		  }
		}
		System.out.println("Please Enter a valid Year according to Gregorian Calender");
		input.close();
	}
}
