import java.util.Scanner;
public class FindMaxHandshakes{
      
	 //create method for computing maximum number of handshakes
	 public static int maxNumberOfHandshakes( int numberOfStudents ){
     //using formula to calculate the maximum number of possible handshakes.
		int result = (numberOfStudents * (numberOfStudents - 1)) / 2;
		return result; //return the result to the calling function
	}
		
	public static void main(String[]args){
	
		//create variables for numberOfStudents and maxHandShake 
		int numberOfStudents ,maxHandShake;
		
		//create Scanner Object to take user input
		Scanner sc = new Scanner(System.in);
		
		//Taking user input number of students
		System.out.println("Enter the Number of Students N : ");
	    numberOfStudents = sc.nextInt();
		
		//calling function ,it calls the maxNumberOfHandshakes() method
		 maxHandShake = maxNumberOfHandshakes(numberOfStudents);
		//print maximum number of Handshakes among N number of students.
		System.out.println("The maximum number of possible Handshakes is: "+maxHandShake);

	}
}