import java.util.*;
public class UniversityfeeDiscount{
	
	public static void main(String args[])
        {
	
              Scanner sc =new Scanner(System.in);	
	     
	      System.out.println("Enter Student Fee : "); 
	      //create a variable fee
	      double fee=sc.nextDouble();
				
              System.out.println("Enter Discount amount : ");
	      //create a vriable discountPercent
	      double discountPercent=sc.nextDouble();
		
	      //create a variable discount
	      double discount=fee*discountPercent/100;
		
	     //Compute and print the fee you have to pay by subtracting the discount from the fee
	     System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));	
	}	
	
}