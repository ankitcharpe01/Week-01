import java.util.*;

public class FriendsComparison{
	//main
	public static void main(String [] args){
		// create scanner object
		Scanner sc = new Scanner (System.in);
		// Take Amar , Akbar ,Anthony height and age as input 
		System.out.println("Enter Amar's age : ");
		int amarAge = sc.nextInt();
		
		System.out.println("Enter Amar's height : ");
		int amarHeight = sc.nextInt();
		
		System.out.println("Enter Akbar's age : ");
		int akbarAge = sc.nextInt();
		
		System.out.println("Enter Akbar's height : ");
		int akbarHeight = sc.nextInt();
		
		System.out.println("Enter Anthony's age : ");
		int anthonyAge = sc.nextInt();
		
		System.out.println("Enter Anthony's height : ");
		int anthonyHeight = sc.nextInt();
		
		//find youngest age 
		int youngestAge=Math.min(amarAge, Math.min(akbarAge,anthonyAge));
		
		String youngestFriend =(youngestAge == amarAge)? "Amar":
		                       (youngestAge == akbarAge)? "Akbar":"Anthony";
							   
		//calculate tallestheight
		int tallestHeight=Math.min(amarHeight, Math.min(akbarHeight,anthonyHeight));
		
		String tallestFriend =(tallestHeight == amarHeight)? "Amar":
		                       (tallestHeight == akbarHeight)? "Akbar":"Anthony";
							   
      //print the output
	  System.out.println("The youngest friend is "+ youngestFriend+" with age " +youngestAge);
	  System.out.println("The tallest friend is "+ tallestFriend+" with height " +tallestHeight);
	  sc.close();
	}
}