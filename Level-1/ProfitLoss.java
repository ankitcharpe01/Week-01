public class ProfitLoss{
     public static void main(String []args){
		 //Creating variable sellingPrice and costPrice
	     int sellingPrice=191;
		 int costPrice = 129;
		 //Calculate profit using formula profit = sellingPrice-costPrice
		 int profit = sellingPrice - costPrice;
		 //calculating profit percentage
         double profitPercentage = profit / costPrice * 100;
		 //print costPrice and sellingPrice
         System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice);
		 //print profitPercentage
		 System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);
	 }
}