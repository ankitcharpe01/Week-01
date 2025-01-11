import java.util.Scanner;
public class DaysOfWeek {

// main function
    public static void main(String[] args) {
	 //taking iput through Scanner object
		Scanner sc = new Scanner(System.in);
		//Take month as input
		System.out.println("Enter month : ");
		int m = sc.nextInt();
		
		//Take day as input
		System.out.println("Enter day : ");
		int d= sc.nextInt();
		
		//Take year as input
		System.out.println("Enter year : ");
		int y = sc.nextInt();
		
        //Claculating using formula 
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        //Print statement
        System.out.println("The day of the week is: " + d0);
        System.out.println("(0 = Sunday, 1 = Monday, 2 = Tuesday, ..., 6 = Saturday)");
    }
}