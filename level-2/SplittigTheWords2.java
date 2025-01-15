import java.util.Scanner;

public class SplittigTheWords2
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
	
	public static int stringLength(String str){
		int length =0 ;
		char ch[] = str.toCharArray();
		for(char c : ch){
			length++;
		}
		return length;
	}
	
	
	//split the words
	public String[] splitWords(String string , int c){
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
	
	//Comparing results
	public static boolean compareResults(String [] arr1 ,String [] arr2){
		if(arr1.length != arr2.length){
			return false;
		}
		
		for(int i=0 ; i<arr1.length;i++){
			if(!arr1[i].equals(arr2[i])){
				return false;
			}
		}
		return true;
	}
	
	//main method
		public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
		
		//taking input
		System.out.println("Enter a text :");
		String str=sc.nextLine();
		sc.nextLine();
		
		
		SplittigTheWords sw= new SplittigTheWords();
		int count=sw.countWords(str);
		
		int length = stringLength(str);
		
		//create a method to split the textinto wordsusing charAt()
		String [] userDefinedWords = sw.splitWords(str,count);
		String [] splitMethodWords = str.split(" ");
		
		//create a method to compare the two string array and return a boolean
		boolean isEqual = compareResults(userDefinedWords,splitMethodWords);
		
		System.out.println("The Length of the String Without using built-in length() method is : "+length);
			
		//Print the answer
		System.out.println("The words of the String of using user-defined method is : ");
		for(int i=0;i<userDefinedWords.length;i++){			
			System.out.print(userDefinedWords[i]);	
		    System.out.println();
		}
		for(String[] rows : userDefinedWords){
			System.out.println(rows[0]);
		}
		System.out.println("The words of the String of using builtin split method is : ");
		for(int i=0;i<splitMethodWords.length;i++){			
			System.out.print(splitMethodWords[i]);	
		    System.out.println();
		}
		System.out.println("Are the Results from both the String are equal ? "+ isEqual);

		sc.close();
	}
}