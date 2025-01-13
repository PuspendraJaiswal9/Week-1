import java.util.Scanner;
public class SimpleInterest{
       
       //Create Method.
       public void Calculate(){
          
          // Create a Scanner object for user input 
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Principle:");
          int principle=sc.nextInt();
          System.out.println("Enter rate:");
          int rate=sc.nextInt();
          System.out.println("Enter time:");
          int time=sc.nextInt();
      
          //Apply formula
          double si=(principle*rate*time)/100;
          
         //Display simple interest
          System.out.println("The Simple Interest is "+si+" for Principal "+principle+", Rate of Interest " +rate+" and Time "+time);   
       }

       public static void main(String args[]){
           // Create object.
           SimpleInterest obj=new SimpleInterest();
         
          //Method calls.
          obj.Calculate();
      }
}