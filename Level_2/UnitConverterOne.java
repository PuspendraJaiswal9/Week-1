import java.util.Scanner;
public class UnitConverterOne{
       public static double convertYardsToFeet(double yards)
       {
          return yards*3;
       } 
       
       public static double convertFeetToYards(double feet)
       {
         return feet*0.333333;
       } 

       public static double  convertMetersToInches(double meters)
       {
          return meters*39.3701;

       } 
     
       public static double  convertInchesToMeters(double inches)
       {
          return inches*0.0254;
       } 

       public static double  convertInchesToCentimeters(double inches)
       {
          return inches*2.54;
       } 

       
       public static void main(String args[]){
         //Create Scanner object for user Input.
           Scanner sc=new Scanner(System.in);
         
         //take inpute in km
           System.out.println("Enter number in yards");
           double yards=sc.nextDouble();
           System.out.println("Enter number in feet");
           double feet=sc.nextDouble();
           System.out.println("Enter number in meters");
           double meters=sc.nextDouble();
           System.out.println("Enter number in inches");
           double inches=sc.nextDouble();
           
           //Display output.
           System.out.println(yards+" yards convert to feet is :"+convertYardsToFeet(yards));
           System.out.println(feet+" feet convert to yards is :"+convertFeetToYards(feet));
           System.out.println(meters+" meters convert to inches is :"+convertMetersToInches(meters));
           System.out.println(inches+" inches convert to meters is :"+convertInchesToMeters(inches));
           System.out.println(inches+" inches convert to centimeters is :"+convertInchesToCentimeters(inches));  
       }       
}