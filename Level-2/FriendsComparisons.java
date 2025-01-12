import java.util.*;

public class FriendsComparisons{
	//main
	public static void main(String [] args){
		// create scanner object
		Scanner sc = new Scanner (System.in);
		
		
		int heights [] = new int[3];
		int ages [] = new int[3];
		String name[] = new String[3];
		
		//Take inputs from user
		System.out.println("Enter Name,height and age of 3 friends: ");
        for(int i=0 ; i<3 ;i++){
        System.out.println("Enter name of friend: "+(i+1));
		 name[i] = sc.next();
		System.out.println("Enter height of friend: "+(i+1));
		 heights[i] = sc.nextInt();	
		System.out.println("Enter age of friend: "+(i+1));
		ages[i] = sc.nextInt();			
		}
		 // Declaring variables to find the youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Applying loop through the arrays
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Displaying the results
        System.out.println("Youngest Friend: " + name[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + name[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();

	}
}