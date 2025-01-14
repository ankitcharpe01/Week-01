import java.util.Scanner;

public class SplittigTheWords
{ 	
	//count words
	public int countWords(String string){
		int count=0;
		for(int i=0 ;i<string.length();i++){
			if( string.charAt(i)==' '){
				count++;
			}
				
		}
		return count;
	}
	
	public String[] checkSplitWords(String string , int c){
		String Words[]=new String[c+1];
		
		int j=0;
		String temp="";
		for(int i=0 ;i<string.length();i++){
			if(string.charAt(i)!=' '){
				temp+=string.charAt(i);
				
			}else if(string.charAt(i)==' ' ){
				Words[j++]=temp;
				temp=" ";
				
			}
		}
		Words[j]=temp;
		return Words;	
	}
	
	public int[] countLength(String string , int c){
		int lengthWord[]=new int[c+1];
		int j=0;
		int count =0;
		for(int i=0 ;i<string.length();i++){
			if(string.charAt(i)!=' '){
				count++;
			}else if(string.charAt(i)==' '){
				lengthWord[j++]=count;
				count =0;
			}
		}
		lengthWord[j]=count;
		return lengthWord;
		
	}
	
	public String[][] TwoDArray(String[] Words , int[] lengthWord , int c){
		String[][] array=new String[c+1][2];
		int m=0 ,n =0;
		for(int i=0;i<=c;i++){
				array[i][0]=Words[m++];
				array[i][1]=String.valueOf(lengthWord[n++]);
		}
		
		return array;
	}
	
	
	//main method
		public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
		//taking input
		System.out.println("Enter a text :");
		String string=sc.nextLine();
		sc.nextLine();
		
		
		SplitWords sw= new SplitWords();
		int count=sw.countWords(string);
		
		String countWord[]=sw.checkSplitWords(string , count);
		
		int countLength[]=sw.countLength(string , count);
		String answer[][]=sw.TwoDArray(countWord ,countLength , count);
		
		for(int i=0;i<answer.length;i++){
			for(int j=0;j<answer[i].length;j++){
			System.out.print(answer[i][j] + " " );
	    	}
		  System.out.println();
		}
		
		sc.close();
	}
}