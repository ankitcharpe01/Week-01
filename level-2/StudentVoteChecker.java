//import Scanner class
import java.util.Scanner;

public class StudentVoteChecker {

	public static boolean canStudentVote(int age){
			if(age<0){
			return false;
			}else if(age>=18){
			return true;
			}else{
			return false;
			}
	}
	//main function
    public static void main(String[] args) {
	    //Create a scanner object
        Scanner sc = new Scanner(System.in);
		
		//Define an Array
		int studentsAge[] = new int[10];
		
		//Take user input for the age of all 10 students
		System.out.println("Enter the age of all 10 students in a class: ");
		for(int i=0; i<studentsAge.length ;i++){
			studentsAge[i] = sc.nextInt();
		}
		
		//Check and display voting eligibility
		for(int i=0 ;i<studentsAge.length ;i++){
			boolean result = canStudentVote(studentsAge[i]);
			System.out.println("Student "+(i+1) + "(age "+ studentsAge[i] + ") can vote: "+result );
		}
        sc.close();
    }
}