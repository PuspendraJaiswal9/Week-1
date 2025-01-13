import java.util.Scanner;
public class CalculateWind{
      
      // Create Methods 
      public double calculateWindChill(double temperature, double windSpeed)
      {
           //Calculate Wind Chill using formula.
          double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
          return windChill;
           
      }

      public static void main(String args[])
      {
          
          // Create a Scanner object for user input 
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter temperature:");
          double temperature=sc.nextDouble();

          System.out.println("Enter windSpeed:");
          double windSpeed=sc.nextDouble();
          
          // Create object
          CalculateWind obj=new CalculateWind();

          //Method calls.
          double ans = obj.calculateWindChill(temperature,windSpeed);
          System.out.println("The wind chill temperature is :"+ans);
     }
}
