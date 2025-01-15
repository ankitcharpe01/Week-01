import java.util.Scanner;

public class UniqueCharacters {

    // Method to calculate the length of a string without using `length()`
    public static int findLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
           System.out.println("IndexOutOfBoundsException ig generated");
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String str) {
        int length = findLength(str); 
        char[] unique = new char[length]; 
        int uniqueIndex = 0; 

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the unique array
            for (int j = 0; j < uniqueIndex; j++) {
                if (unique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the unique array
            if (isUnique) {
                unique[uniqueIndex++] = currentChar;
            }
        }

        // Copy unique characters to a new array of the exact size
        char[] result = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        char[] uniqueChars = findUniqueCharacters(input);
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
