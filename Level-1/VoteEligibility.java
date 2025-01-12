//import Scanner class
import java.util.Scanner;

public class VoteEligibility {
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
		//logic
		for(int i=0 ;i<studentsAge.length ;i++){
			if(studentsAge[i]<0){
			System.out.println("Invalid Age !");
			}else if(studentsAge[i]>=18){
			System.out.println("The student with the age "+ studentsAge[i]+ " can vote.");
			}else{
			System.out.println("The student with the age "+ studentsAge[i]+ " cannot vote.");
			}
		}
        sc.close();
    }
}