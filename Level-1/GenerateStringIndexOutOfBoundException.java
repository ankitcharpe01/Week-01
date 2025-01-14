import java.util.Scanner;
public class GenerateStringIndexOutOfBoundException{
	
	 public static void generateStringIndexOutOfBoundsException(String str) {       
	  //generate String Index Out Of Bounds Exception
		
		char result = str.charAt(str.length()+1);
		System.out.println(result);
	  
    }
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		try{
			generateStringIndexOutOfBoundsException(str);
		}catch(StringIndexOutOfBoundsException ex){
			System.out.println("String Index Out Of Bound exception is generated "+ex.getMessage());
		}
	}
}