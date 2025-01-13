import java.util.Scanner;
public class FindRemainderOne{
      
      // Create Methods 
      public static int[] findRemainderAndQuotient(int number, int divisor) {

           int quotient=number/divisor;
           int remainder=number%divisor;
           //Output Display
           System.out.println("quotient is "+quotient+" Remainder is "+remainder);
           return new int[]{};
      }

       public static void main(String args[]){
          
          // Create a Scanner object for user input 
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter numberOfChoclates:");
          int numberOfChoclates=sc.nextInt();

          System.out.println("Enter numberOfStudents:");
          int numberOfStudents=sc.nextInt();
        
          //Method calls.
          findRemainderAndQuotient(numberOfChoclates,numberOfStudents);
     }
}
