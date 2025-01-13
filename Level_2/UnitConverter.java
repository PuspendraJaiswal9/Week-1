import java.util.Scanner;
public class UnitConverter{
       public static double convertKmToMiles(double km)
       {
          return km*0.621371;
       } 
       
       public static double convertMilesToKm(double miles)
       {
         return miles*1.60934;
       } 

       public static double convertMetersToFeet(double meters)
       {
          return meters*3.28084;

       } 
     
       public static double convertFeettoMeters(double feet)
       {
          return feet*0.3048;
       } 
       
       public static void main(String args[]){
         //Create Scanner object for user Input.
           Scanner sc=new Scanner(System.in);
         
         //take inpute in km
           System.out.println("Enter number in km");
           double km=sc.nextInt();
           System.out.println("Enter number in miles");
           double miles=sc.nextInt();
           System.out.println("Enter number in meters");
           double meters=sc.nextInt();
           System.out.println("Enter number in feet");
           double feet=sc.nextInt();
           
           //Display output.
           System.out.println(km+" km convert to miles is :"+convertKmToMiles(km));
           System.out.println(miles+" miles convert to km is :"+convertMilesToKm(miles));
           System.out.println(meters+" meter convert to feet is :"+convertMetersToFeet(meters));
           System.out.println(feet+" feet convert to meter is :"+convertFeettoMeters(feet));
         
       }

        
}