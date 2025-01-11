import java.util.*;
public class HeightConvertor{
	
	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		
		//print message to hint user
		System.out.println("Enter your height in centimeters :");
		
		//create a variable height takes your height in centimeters
		double height= sc.nextDouble();
		
		//create a variable heightInInch convert height in inch 1 inch = 2.54 cm
		double heightInInch = height/2.54;
		
		//create a vairable heightInFeet convert height in feet  1 foot = 12 inches
		double heightInFeet= heightInInch/12.0;
		
		
		System.out.println("Your Height in cm is "+height+" while in feet is "+heightInFeet+" and inches is "+heightInInch);
		
		
		
		
	}
	
	
	
	
	
}