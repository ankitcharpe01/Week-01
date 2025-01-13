//import scanner class
import java.util.Scanner;

public class BMICalculator {

	//compute BMI Calculation
    public static void bmiCalculation(double[][] details) {
        for (int i = 0; i < details[0].length; i++) {
            double weight = details[i][0]; 

			//height converts in meters 
            double height = details[i][1] / 100; 
			
            //calculate BMI
            double bmi = weight / (height * height); 
            details[i][2] = bmi; 
        }
        
    }
	
   //method for check bmi status
    public static void bmiStatus(double[][] details) {
        for (int i = 0; i < details.length; i++) {
            double bmi = details[i][2];
            if (bmi <= 18.4) {
                System.out.println("Underweight");
            } else if(bmi >= 18.5 && bmi < 25) {
                System.out.println("Normal");
            } else if (bmi >= 25 && bmi < 40) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
        }
    }
	
   //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personDetails = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the weight of person : " + (i + 1));
            personDetails[i][0] = sc.nextDouble(); 
            System.out.println("Enter the height of person : " + (i + 1));
            personDetails[i][1] = sc.nextDouble(); 
        }
		//call bmi calculation
        bmiCalculation(personDetails);
		//call bmi status
        bmiStatus(personDetails);

        sc.close();
    }
}
