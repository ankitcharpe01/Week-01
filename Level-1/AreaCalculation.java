import java.util.Scanner;
public class AreaCalculation{
   public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	  //taking inputs from user
	  System.out.println("Enter base in cm ");
       int base=sc.nextInt();
	   System.out.println("Enter height in cm ");
       int height=sc.nextInt();
	  //Calculating areas 
	   double areaInCm=(0.5)*base*height;
	   double areaInInches=areaInCm/2.54;
	  
	  //Printing output 
       System.out.println("The area in centimeters is "+(areaInCm)+" and the area in inches is " + (areaInInches));
	   
	  
   }
}