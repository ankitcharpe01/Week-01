//import Scanner class
import java.util.Scanner;

public class HeightsOfPlayers{
	//main function
    public static void main(String[] args) {
	    //Create a Scanner class object
        Scanner sc = new Scanner(System.in);
		
		//Declare an array and allocating memory in an array
		double heights[] = new double[11];
		
		//Enter the heights of 11 players
		System.out.println("Enter the Heights of 11 players");
		double sum =0;
		
		//The formula to calculate the mean is: mean = sum of all elements / number of elements
		for(int i=0; i<11 ;i++){
		 heights[i]=sc.nextDouble();
		 //calculate sum of all elements present in array
		 sum+=heights[i];
		}
		//Compute mean
		double mean = sum / 11;
		System.out.println("The mean height of the football team is: "+mean);
		
		//closing of Scanner
        sc.close();
    }
}