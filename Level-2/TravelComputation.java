import java.util.*;

//Create TravelComputation Class to compute the distance and travel time
public class TravelComputation{

    //main function
	public static void main(String[]args){
	
	    //Creating Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Create a variable name and take input from user to indicate the person travelling
		System.out.println("Enter the name of the person :");
		String name = sc.nextLine();
		
		//Create a variable fromCity , viaCity and toCity to indicate the city
		//from city, via city and to city the person is travelling and take inputs from user
		
		System.out.println("Enter from City: ");
		String fromCity =sc.nextLine();
		
		System.out.println("Enter viaCity: ");
		String viaCity =sc.nextLine();
		
		System.out.println("Enter toCity: ");
		String toCity =sc.nextLine();
		
		//create a variable distanceFromToVia to indicate the distance 
		//between the fronCity to viaCity and take input
		
		System.out.println("Enter Distance from to via: ");
		double distanceFromToVia =sc.nextDouble();
		
		//create a variable timeFromToVia to indicate the time taken to travel from
		// fromCity to viaCity in minutes and take input
		
		int timeFromToVia = 4*60+4;
			
		//create a variable distanceViaToFinalCity to indicate the distance between
		// the viaCity to toCity 
		System.out.println("Enter Distance Via to Final city: ");
		double distanceViaToFinalCity = sc.nextDouble();
		
		//create variable timeViaToFinalCity
		int timeViaToFinalCity = 4*60+25;
		
		//create variable totalDistance and calculate the totalDistance between fromCity to toCity
		double totalDistance = distanceFromToVia + distanceViaToFinalCity;
		
		//total time taken to travel from fromCity to toCity in min.
		int totalTime = timeFromToVia+timeViaToFinalCity;
		
		//Print the travel Details
		System.out.println("The Total Distance travelled by "+ name + " from "+
		                    fromCity +" to "+ toCity+" via "+ viaCity +" is "
							 + totalDistance + " km and "+ "the Total Time taken is " +totalTime+" minutes");
	}
}