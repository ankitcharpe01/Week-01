import java.util.Scanner;
public class GenerateNumberFormatException{
	
	 public static void generateNumberFormatException(String str) {       
	  //generate Number Format Exception
	  //if user entered the wrong input like "abc123" and we convert to int ,at that time 
	  //NumberFormatException is generated
		int a = Integer.parseInt(str);
		System.out.println(a);
	  
    }
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		
		try{
			generateNumberFormatException(str);
		}catch(NumberFormatException ex){
			System.out.println("Number Format Exception is generated ");
		}
	}
}