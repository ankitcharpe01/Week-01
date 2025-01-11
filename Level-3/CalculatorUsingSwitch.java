
import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {
		// Taking input from the user 
        Scanner sc = new Scanner(System.in);

		//Enter the first number
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
		
		//Choose operator 
        System.out.print(" choose operator (+, -, *, /) : ");
        String operation = sc.next();
		
		//Enter Second Number
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Perform calculation with Switch_Case
        switch (operation) {
            case "+" : 
			System.out.println("Result: " + (first + second));
			break;
            case "-" : 
			System.out.println("Result: " + (first - second));
			break;
            case "*" : 
			System.out.println("Result: " + (first * second));
			break;
            case "/" : 
			System.out.println(second != 0 ? "Result: " + (first / second) : "Cannot divide by zero");
			break;
            default  : 
			System.out.println("Invalid Operator");
        }
		sc.close();
    }
}
