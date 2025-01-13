import java.util.Scanner;
public class SmallestLargest{
       
       //Create Method.
       public void smallestCheck(int number1,int number2,int number3){
                                   
          //Check number is smallest.
          if(number1<number2 && number1<number3){
            System.out.println(number1+" is smallest ");
          }else if(number2<number1 && number2<number3){
               System.out.println(number2+" is smallest "); 
          }else{
              System.out.println(number3+" is smallest ");
         }
       }

       public void largestCheck(int number1,int number2,int number3){
                                   
          //Check number is largest.
          if(number1>number2 && number1>number3){
            System.out.println(number1+" is largest ");
          }else if(number2>number1 && number2>number3){
            System.out.println(number2+" is largest "); 
          }else{
            System.out.println(number3+" is largest ");
         }
       }


       public static void main(String args[]){
          
          // Create a Scanner object for user input 
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter number1:");
          int number1=sc.nextInt();

          System.out.println("Enter number2:");
          int number2=sc.nextInt();

          System.out.println("Enter number3:");
          int number3=sc.nextInt();

          
           // Create object.
           SmallestLargest obj=new SmallestLargest(); 
        
          //Method calls.
          obj.smallestCheck(number1,number2,number3);
          obj.largestCheck(number1,number2,number3);    
     }
}
