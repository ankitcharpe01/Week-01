import java.util.Scanner;
public class Perimeter{
   public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	  //taking inputs from user
	   System.out.println("Enter Perimeter");
	   //input perimeter
       int perimeter=sc.nextInt();
	   //Calculate and Print 
	   System.out.println("The length of the side is "+(perimeter/4)+" whose perimeter is "+perimeter);
	  
   }
}