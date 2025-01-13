import java.util.Scanner;
public class LeapYear{

       public static void check(int year){
           //check condition
           if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) 
           {
                   System.out.println(year + " is a leap year");
           } else {
           System.out.println(year + " is not a leap year");
          }

       }
       public static void main(String args[]){
        //Create a Scanner object for user Input.
        Scanner sc=new Scanner(System.in);
        
       //take a input.
        System.out.println("Enter Year:");
        int year=sc.nextInt();
        
        check(year);
       }
}