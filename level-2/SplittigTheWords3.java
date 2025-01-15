import java.util.Scanner;

public class SplittigTheWords3
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
	
	//split the words
	public String[] checkSplitWords(String string , int c){
		String Words[]=new String[c+1];
		
		int j=0;
		String temp="";
		for(int i=0 ;i<string.length();i++){
			if(string.charAt(i)!=' '){
				temp+=string.charAt(i);
				
			}else if(string.charAt(i)==' ' ){
				Words[j++]=temp;
				temp="";
				
			}
		}
		Words[j]=temp;
		return Words;	
	}
	
	//count the words length
	public int[] countLength(String string , int c){
		int lengthWord[]=new int[c+1];
		//space +1 word --> c+1
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
	
	// return 2D array which returns a word and length of word
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
		
		
		SplittigTheWords3 sw= new SplittigTheWords3();
		int count=sw.countWords(string);
		
		String countWord[]=sw.checkSplitWords(string , count);
		
		int countLength[]=sw.countLength(string , count);
		String answer[][]=sw.TwoDArray(countWord ,countLength , count);
		
		//Print the answer
		System.out.println("WORD\tLENGTH");
		for(String[] rows : answer){
			System.out.println(rows[0] + "\t" +Integer.parseInt(rows[1]));
		}
		
		sc.close();
	}
}