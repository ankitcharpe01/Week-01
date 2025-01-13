import java.util.Scanner;

public class CalculateTrignometricFunction{
	
	//user defined method
	public  double [] calculateTrignometricFunction (double angle){
		
		//convert the angle to degree of radian
		double radian = Math.toRadians(angle);
		
		//Calculate sine , cosine and tangent values
		double sine =Math.sin(radian);
		double cosine = Math.cos(radian);
		double tangent =Math.tan(radian);
		
		//return the results in an array
		return new double[]{sine ,cosine,tangent};
	}
	
	//main method
    public static void main(String[] args) {
        
	   CalculateTrignometricFunction tc = new CalculateTrignometricFunction();
		
		Scanner sc = new Scanner(System.in);
        // Take input from user
        System.out.print("Enter angle: ");
        double angle = sc.nextDouble();

        double [] results = tc.calculateTrignometricFunction(angle);
		 
                System.out.println("Angle : "+angle +" degrees" );
		        System.out.println("Sine: "+results[0] );
				System.out.println("Cosine: "+results[1] );
				System.out.println("Tangent: "+results[2] );

        sc.close();
    }
}
