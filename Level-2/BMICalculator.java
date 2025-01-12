import java.util.Scanner;

public class BMICalculator{

// main Function
    public static void main(String[] args) {
	
	//Creating a Scanner Class Object
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // Arrays to store height, weight, BMI, and weight status
        double[] height = new double[numPersons]; 
        double[] weight = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];

        // Taking input for height and weight of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
            //Take input height weight and bmi
            System.out.print("Height (in meters): ");
            height[i] = sc.nextDouble();

            System.out.print("Weight (in kilograms): ");
            weight[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            // Check the weight status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25 && bmi[i] < 40) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Displaying results
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("Weight: " + weight[i] + " kilograms");
            System.out.println("BMI: " + String.format("%.2f", bmi[i])); // Format BMI to 2 decimal places
            System.out.println("Status: " + status[i]);
            System.out.println();
        }

        sc.close();
    }
}