import java.util.*;

public class ConvertDistance{
    public static void main(String[] args) 
   {
      Scanner input=new Scanner(System.in);
      
      System.out.println("Enter value in KM :");

      //Create a variable km and assign type as double. 
      double km = input.nextDouble();

      //Create a variable KilometerToMile to store changed values.
      double kilometerToMile = km * 1.6;

      System.out.println("The total miles is "+kilometerToMile+" mile for the given "+km+" km");       
    }
}
