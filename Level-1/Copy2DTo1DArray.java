import java.util.Scanner;

public class Copy2DTo1DArray{
	//main function
		public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
			//Take rows and columns size as input
			System.out.println("Enter the number of rows: ");
			int rows = sc.nextInt();
			
			System.out.println("Enter the number of columns: ");
			int columns = sc.nextInt();
			
			int [][] matrix = new int [rows][columns];
			System.out.println("Enter the number of 2D array: ");
			
			for(int i=0 ; i<rows; i++){
				for(int j=0 ; j<columns; j++){
					matrix[i][j]=sc.nextInt();
		     	}
			}
			
			//create 1D array of size rows* columns
			int []singleDimensionArray = new int [rows * columns];
			int index=0;
			//Copy the elements of 2D to 1D array
			for(int i=0 ; i<rows; i++){
				for(int j=0 ; j<columns; j++){
					singleDimensionArray[index++] =matrix[i][j];
		     	}
			}
			
			//Print the Array using enhanced for-loop
			for(int element : singleDimensionArray){
			System.out.println(element +" ");
			}
			System.out.println();
			sc.close();
		}
}
