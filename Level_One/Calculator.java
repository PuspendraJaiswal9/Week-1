import java.util.Scanner;
public class Calculator{
       public static void main(String args[])
       {
         Scanner sc=new Scanner(System.in);

         //Takes two numbers.
           System.out.println("Enter First Number:");
           float number1=sc.nextFloat();
           
           System.out.println("Enter Second Number:");
           float number2=sc.nextFloat();
           
           // Perform arithmetic operations
           float addition = number1 + number2;
           float subtraction = number1 - number2;
           float multiplication = number1 * number2;
           float division =  number1 / number2;  
       
           System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+addition+" , "+ subtraction+" , "+multiplication+" , and "+division);      
       }
}