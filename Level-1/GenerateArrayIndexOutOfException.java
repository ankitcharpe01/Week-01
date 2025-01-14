import java.util.Scanner;
public class GenerateArrayIndexOutOfException{
	
	 public static void generateArrayIndexOutOfException(String array[],int index) {       
	  //generate Array Index ot of Bound Exception
		String result = array[index];
		System.out.println(result);
	  
    }
	
	public static void main(String [] args){
		
		//Take inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array elements : ");
		String array []= new  String[5];
		for(int i=0 ;i<array.length;i++ )
		{
		 array[i] = sc.next();
		}
		System.out.println("EnterIndex : ");
		int index = sc.nextInt();
		try{
			generateArrayIndexOutOfException(array ,index);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("(Array Index Out Of Bounds Exception is generated ");
		}
	}
}