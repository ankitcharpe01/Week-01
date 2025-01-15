import java.util.Scanner;

public class NonRepeatingCharacters {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingChar(String str) {
        int[] frequency = new int[256];

       //to calculate the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequency[currentChar]++;
        }

        //first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }

        return '\0';
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingChar(input);

        // Printing the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
