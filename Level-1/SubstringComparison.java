import java.util.Scanner;

public class SubstringComparison{
 
	//method for create a substring
	public static String createSubstringCharAt(String str, int start ,int end){
		char[] result = new char[end-start];
		for(int i=start; i<end; i++){
			result[i-start]=str.charAt(i);
		}
		return new String(result); 
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		//Taking inputs
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the start index: ");
		int startIndex = sc.nextInt();
		
		System.out.println("Enter the end index: ");
		int endIndex = sc.nextInt();
		
		//compare using userdefied method
		String subStringCharAt = createSubstringCharAt(str ,startIndex,endIndex);
		System.out.println("Substring using charAt method is :"+ subStringCharAt);
		
		//compare using built-n method
		String subStringBuiltIn = str.substring(startIndex,endIndex);
		System.out.println("Substring using substring method is :"+ subStringBuiltIn);
		
		//compare both results
		boolean compare = subStringCharAt.equals(subStringBuiltIn);
		System.out.println("Comparison of substrings is : "+ compare);

	}
}