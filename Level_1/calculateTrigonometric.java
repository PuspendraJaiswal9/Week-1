import java.util.Scanner;
public class calculateTrigonometric{
      
      // Create Methods 
      public double[] calculateTrigonometricFunctions(double angle)
      {
         //Convert degree to radians
         double radians=angle*(Math.PI/180);
         
         double sinValue=Math.sin(radians);
         double cosValue=Math.cos(radians);
         double tanValue=Math.tan(radians);
         System.out.println("sinValue is "+sinValue+" and cosValue is "+cosValue+" and tanValue is "+tanValue); 
          return new double[]{};
           
      }

      public static void main(String args[])
      {
          
          // Create a Scanner object for user input 
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter angle in degree:");
          double angle=sc.nextDouble();
          
          // Create object
          calculateTrigonometric obj=new calculateTrigonometric();

          //Method calls.
          obj.calculateTrigonometricFunctions(angle);
  }
}
