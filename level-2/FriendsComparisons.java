import java.util.*;

public class FriendsComparisons{

	//find the youngest friend
	public static String findYoungest(String [] names, int[] ages){
		int minAge =ages[0];
		int index =0;
		
		for(int i=1 ; i<ages.length; i++){
			if(ages[i]<minAge){
				minAge=ages[i];
				index=i;
			}
		}
		return names[index];
	}
	
	//find the tallest friend
	public static String findTallest(String [] names, double[] heights){
		double maxHeight =heights[0];
		int index =0;
		
		for(int i=1 ; i<heights.length; i++){
			if(heights[i]>maxHeight){
				maxHeight=heights[i];
				index=i;
			}
		}
		return names[index];
	}
	
	
	//main
	public static void main(String [] args){
		// create scanner object
		Scanner sc = new Scanner (System.in);
		double heights [] = new double[3];
		int ages [] = new int[3];
		String names[] = new String[3];
		
		for(int i=0 ; i<3 ;i++){
		System.out.println("Enter name of friend: "+(i+1));
		names[i] = sc.next();
		}
		//Take inputs from user
		System.out.println("Enter Name,height and age of 3 friends: ");
        for(int i=0 ; i<3 ;i++){
		System.out.println("Enter height of friend- "+names[i]+" : ");
		heights[i] = sc.nextDouble();	
		System.out.println("Enter age of friend- "+names[i]+" : ");
		ages[i] = sc.nextInt();			
		}
		 
		 String youngest =findYoungest(names ,ages);
		 String tallest =findTallest(names ,heights);

        // Displaying the results
        System.out.println("Youngest Friend is: " + youngest);
        System.out.println("Tallest Friend is: " + tallest);

        sc.close();

	}
}