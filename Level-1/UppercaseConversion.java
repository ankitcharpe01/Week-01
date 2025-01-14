import java.util.Scanner;

public class UppercaseConversion {

   // Method to convert string to uppercase using charAt
    public static String toUpperCaseCompare(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result[i] = (char) (ch - 32);
            } else {
                result[i] = ch;
            }
        }
        return new String(result);
    }
	
	//main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Converting to uppercase using toUpperCaseCompare method
        String uppercaseCompare = toUpperCaseCompare(input);
        System.out.println("Uppercase using toUpperCaseCompare method: " + uppercaseCompare);

        // Converting to uppercase using built-in method
        String uppercaseBuiltIn = input.toUpperCase();
        System.out.println("Uppercase using built-in method: " + uppercaseBuiltIn);

        // Comparing the two results
        boolean comparisonResult = uppercaseCompare.equals(uppercaseBuiltIn);
        System.out.println("Both methods Comparison result: " + comparisonResult);
    }

}