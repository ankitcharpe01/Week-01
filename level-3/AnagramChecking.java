import java.util.Scanner;

public class AnagramChecking {

    // method to check if the texts are in the anagram form
    public static boolean anagramsCheck(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        // converting both texts to lowercase
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        // frequency arrays
        int[] freq1 = new int[256]; 
        int[] freq2 = new int[256]; 
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // looping throughout frequency
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first text:");
        String text1 = sc.nextLine();

        System.out.println("Enter the second text:");
        String text2 = sc.nextLine();

        boolean result = anagramsCheck(text1, text2);

        if (result) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }

        sc.close();
    }
}