//import scanner class
import java.util.Scanner;

public class BMICalculator {

	//compute BMI Calculation
    public static double[][] bmiCalculation(double[][] details) {
		double bmiDetails[][] = new double[details.length][details.length];
        for (int i = 0; i < details[0].length; i++) {
            double weight = details[i][0]; 

			//height converts in meters 
            double height = details[i][1] / 100; 
			
            //calculate BMI
            double bmi = weight / (height * height); 
            bmiDetails[i][2] = bmi; 
        }
		return bmiDetails;
    }
	
   //method for check bmi status
    public static String [][] bmiStatus(double[][] bmiDetails) {
		String result [][] = new String[bmiDetails.length][bmiDetails.length];
        for (int i = 0; i < bmiDetails.length; i++) {
            double bmi = bmiDetails[i][2];
            if (bmi <= 18.4) {
               result[i][2] = "UnderWeight";
            } else if(bmi >= 18.5 && bmi <= 24.9) {
                result[i][2] = "Normal";
            } else if (bmi >= 25 && bmi <=39.9) {
                 result[i][2] = "Overweight";
            } else {
                 result[i][2] = "Obese";
            }
        }
		return result;
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
        double bmiResult[][] = bmiCalculation(personDetails);
		//call bmi status
        String results[][] = bmiStatus(bmiResult);
		
		for(int i=0 ;i<results.length; i++){
			System.out.println("Person "+(i+1)+" Height : "+personDetails[i][1] +" Weight : "+personDetails[i][0]+ " Status : "+results[i][2]+ " BMI result : "+ bmiResult[i][3]);
		}
        sc.close();
    }
}
