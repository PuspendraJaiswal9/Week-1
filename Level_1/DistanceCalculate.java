import java.util.Scanner;
public class DistanceCalculate{
       
       //Create Method.
       public void Calculate(){
          
          // Create a Scanner object for user input 
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter side1:");
          double side1=sc.nextDouble();
          System.out.println("Enter side2:");
          double side2=sc.nextDouble();
          System.out.println("Enter side3:");
          double side3=sc.nextDouble();
                
          //add all sides.
          double perimeter=side1+side2+side3;

          // Calculate distance 5 km to meter
           double distance=5000.0;

          //Calculate rounds.
          double rounds=distance/perimeter;
          
         //Display output
          System.out.printf("The athlete needs to complete %.0f rounds to cover 5 km.\n", Math.ceil(rounds));   
       }

       public static void main(String args[]){
           // Create object.
            DistanceCalculate obj=new DistanceCalculate(); 
        
          //Method calls.
          obj.Calculate();
      }
}
