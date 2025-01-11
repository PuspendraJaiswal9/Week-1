public class ProfitLoss{
       public static void main(String args[]){
         //Create Variable cost Price.
         int costPrice=129;

         // Create Variable Selling Price.
         int sellingPrice=191;

         //Calculate Profit.
         int profit=sellingPrice-costPrice;

          // Calculate ProfitPercentage.
         double profitPercentage=(double)profit/costPrice*100;
         System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+" The Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);

       }
}