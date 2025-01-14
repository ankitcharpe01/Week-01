import java.util.Scanner;
public class NullPointerExceptionDemo{
	
	 public static void generateNullPointer() {
	 //Defining the variable text and initializing it to null
       String text = null;
	  //generate null pointer exception
       System.out.println(text.length());
	  
    }
	
	public static void main(String [] args){
		
		try{
			generateNullPointer();
		}catch(NullPointerException ex){
			System.out.println("Null Pointer exception is generated "+ex.getMessage());
		}
	}
}