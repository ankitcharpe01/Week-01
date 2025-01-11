import java.util.Scanner;


public class PercentageCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//Taking input from user
		System.out.println("Enter thr marks of physics,chemistry and maths");
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();
		
		//Equal to each subject
        double totalMarks = 300; 
		
		//Calculate Average marks
        double averageMark = (physics + chemistry + maths) / 3.0;
        String gradeAndRemarks = "";
		//Logic
        if (averageMark >= 80) {
            gradeAndRemarks = "Level 4";
        } else if (averageMark >= 70 && averageMark < 80) {
            gradeAndRemarks = "Level 3";
        } else if (averageMark >= 60 && averageMark < 70) {
            gradeAndRemarks = "Level 2";
        } else if (averageMark >= 50 && averageMark < 60) {
            gradeAndRemarks = "Level 1";
        } else if (averageMark >= 40 && averageMark < 50) {
            gradeAndRemarks = "Leve l-";
        } else {
            gradeAndRemarks = "Remedial standards";
        }
        //Printing the output
        System.out.println("Average Mark: " +  averageMark);
        System.out.println("Grade and Remarks: " + gradeAndRemarks);
		sc.close();
    }
}