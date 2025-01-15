import java.util.Scanner;
public class LengthOfString{

    public static int stringLength(String str){
	 int count=0;
	 try{
	 while(true){
		str.charAt(count);
		count++;
	 }
	 }catch(StringIndexOutOfBoundsException ex){
			System.out.println("String Index Out Of Bound Exception Generated in string length method ");
	 }
	 return count;
	}
	
	public static void  main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		
		 int userDefinedLength=stringLength(str);	
		System.out.println("UserDefined method length of string : "+userDefinedLength);		
		//built in method 
		int builtInLength = str.length();
		System.out.println("Built-in method length of string : "+builtInLength);
		
	   
		
		sc.close();
	}
}