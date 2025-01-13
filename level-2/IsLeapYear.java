//import Scanner class
import java.util.Scanner;

public class IsLeapYear{
	
	//Create a method to check whether the year is leap year or not
	public static boolean isLeapYear(int year){
	
		//check the year conditions
		//Year is according to Gregorian Calender
		if(year>=1582){
		//check the year is leap year or not ?
		  if(year % 4==0 && year%100!=0 || year%400==0){
				return true;
		  }else{
				return false;
		  }
		}
		return false;
	}
	
	//main function
    public static void main(String[] args) {
	    //Creating a scanner class object
        Scanner input = new Scanner(System.in);
		
        // Take user input 
		//Enter a valid Year according to Gregorian Calender
		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		//call the method isLeapYear 
		boolean result = isLeapYear(year);
		if(result){
			System.out.println("Yes ! the year "+year+" is Leap Year");
		}else {
			System.out.println("No ! the year you have entered is not a Leap Year");
		}
		input.close();
	}
}
