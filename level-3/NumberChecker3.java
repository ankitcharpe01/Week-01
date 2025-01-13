import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {

    // Method to find the count of digits in the number
    static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in a digits array
    static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10; 
            number = number / 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];
        }
        return reverse;
    }

    // Method to compare two arrays 
    public static boolean compareArrays(int[] array1, int[] array2) {
	  int length1 = array1.length;
	  int length2 = array2.length;
	  if(length1!=length1){
        return false;
		}
		for(int i=0 ; i<length1;i++){
			if(array1[i]!=array2[i]){
			 return false;
			}
		 }
		return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking inputs
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        
        // calling and printing methods
        System.out.println("Count of digits in " + number + ": " + countDigits(number));
        int[] digits = getDigitsArray(number);
		
        System.out.println("Digits array for " + number + ": " + Arrays.toString(digits));
        int[] reversedDigits = reverseArray(digits);
		
        System.out.println("Reversed digits array for " + number + ": " + Arrays.toString(reversedDigits));
        System.out.println(number + " is a palindrome: " + isPalindrome(number));
        System.out.println(number + "  a duck number: " + isDuckNumber(number));
        sc.close();
    }
}