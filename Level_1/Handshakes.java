import java.util.Scanner;
public class Handshakes{
       
       //Create Method.
       public void Calculate(){
          
          // Create a Scanner object for user input 
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Number of Students:");
          int n=sc.nextInt();
                
          //Apply formula
          int combination = (n * (n - 1)) / 2;
          
         //Display output
          System.out.println("the maximum number of possible handshakes "+combination);   
       }

       public static void main(String args[]){
           // Create object.
            Handshakes obj=new Handshakes(); 
        
          //Method calls.
          obj.Calculate();
      }
}
