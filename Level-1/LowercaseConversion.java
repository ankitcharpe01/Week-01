import java.util.Scanner;

public class LowercaseConversion {

   // Method to convert string to lowercase using charAt
    public static String toLowerCaseCompare(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result[i] = (char) (ch + 32);
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

        // Converting to lowercase using toLowerCaseCompare method
        String lowercaseCompare = toLowerCaseCompare(input);
        System.out.println("Lowercase using toLowerCaseCompare method: " + lowercaseCompare);

        // Converting to lowercase using built-in method
        String lowercaseBuiltIn = input.toLowerCase();
        System.out.println("LowerCase using built-in method: " + lowercaseBuiltIn);

        // Comparing the two results
        boolean comparisonResult = lowercaseCompare.equals(lowercaseBuiltIn);
        System.out.println("Both methods Comparison result: " + comparisonResult);
    }

}