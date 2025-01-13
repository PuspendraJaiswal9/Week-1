import java.util.Scanner;
public class Natural{


       public static int solveRecursion(int number){
            //Base case
            if(number<=0){
               return 0;
            }

           return number+solveRecursion(number-1);
       }

       public static int solveFormula(int number){
           int sum=(number*(number+1)/2);
           return sum;
       }
       public static void main(String args[]){
        //Create Scanner object for user input
          Scanner sc=new Scanner(System.in);

         //take a number
         System.out.println("Enter a number:");
         int number=sc.nextInt();

         //check number is natural or not
         if(number<=0){
           System.out.println(number+" is not a natural number");
         }else{
            //solve by using recursion.
            int ans1=solveRecursion(number);
            System.out.println("Sum of natural number by using recursion is "+ans1);

            //solve by formula.
            int ans2=solveFormula(number);
            System.out.println("Sum of natural number by using formula is "+ans2);
         }
       }     
}