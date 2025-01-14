import java.util.Scanner;
public class ReturnAllCharacters{
	
	 public String  withoutToCharArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
             char ch = str.charAt(i);
             result[i]=ch;
        }
		String arr = new String(result);
        return arr;
    }
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		//Take input from user 
		System.out.println("Enter a String");
		String string = sc.next();
		
		ReturnAllCharacters obj = new ReturnAllCharacters();
		String withoutToChar = obj.withoutToCharArray(string);
        System.out.println("Characters in a string using the user-defined method: " + withoutToChar);

         char [] withToChar = string.toCharArray();
		 String str = new String(withToChar);
         System.out.println("Characters in a string using the built-in method: " + str);

        // Comparing the two results  with toCharArray and without toCharArray
        boolean comparisonResult = withoutToChar.equals(str);
        System.out.println("Both methods Comparison result: " + comparisonResult);
		
	}
}