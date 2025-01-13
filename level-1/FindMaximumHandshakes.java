import java.util.*;
public class FindMaximumHandshakes{
	public static void main(String[]args){
		//create variables for numberOfStudents and maxHandShake 
		int numberOfStudents ,maxHandShake;
		//create Scanner Object to take user input
		Scanner sc = new Scanner(System.in);
		//Taking user input number of students
		System.out.println("Enter the Number of Students N : ");
	    numberOfStudents = sc.nextInt();
		//using formula to calculate the maximum number of possible handshakes.

		maxHandShake = (numberOfStudents * (numberOfStudents - 1)) / 2;
		//print maximum number of Handshakes among N number of students.

		System.out.println("The maximum number of possible handshakes is: "+maxHandShake);

	}
}