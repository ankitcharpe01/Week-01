public class DividePens{
     public static void main(String []args){
		//Declaring variables
	         int totalPens =14;
		 int students=3;
		// calculating divide 14 pens among 3 students equally
		 int penPerStudent =totalPens/students;
		//calculating remaining non-distributed pens
		 int remaningPens =totalPens%students;
		//Print divide 14 pens among 3 students equally and remaining non-distributed pens
         System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pen not distributed is "+remaningPens);
	 }
}