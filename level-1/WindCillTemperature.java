import java.util.Scanner;

public class WindCillTemperature{
	
	//user defined method
	public static double calculateWindChill(double temperature ,double windSpeed){
		
		//Calculating wind chill
		 double windChill = 335.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow( windSpeed,0.16);
		 return windChill;
	}
	
	//main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed: ");
        double windSpeed= sc.nextInt();
         
		 //Print wind chill temperature
        double windCillTemperature = calculateWindChill(temperature,windSpeed);
        System.out.println("The wind chill temperature is :"+windCillTemperature);
        sc.close();
    }
}
