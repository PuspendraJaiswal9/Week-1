import java.util.Scanner;
public class Factor{

      public static int[] factorCalculate(int number){
         int count=0;
         for(int i=1;i<=number;i++){
            if(number%i==0){
               count++;
           }
         }
         int[] fact=new int[count];
         int index=0;
         for(int i=1;i<=number;i++){
            if(number%i==0){
               fact[index++]=i;
            }
         }
         return fact; 
      }

      public static int sumCalculate(int[] arr){
          int sum=0;
          for(int f:arr){
              sum+=f;
          }
        return sum; 
      }

      public static int proCalculate(int[] arr){
         int pro=1;
         for(int f:arr){
           pro*=f;
         }
        return pro;
      }

      public static int squreCalculate(int[] arr){
         int sum=0;
         for(int f:arr){
           sum+=Math.pow(f,2);
         }
        return sum;
      }

      public static void main(String args[]){
        
       //Create a Scanner object for user input
       Scanner sc=new Scanner(System.in);
       
       //take a number
       System.out.println("Enter a number:");
       int number=sc.nextInt();
       
       int[] arr=factorCalculate(number);
       System.out.print("Factors of " + number + ": ");
        for (int f : arr) {
            System.out.print(f + " ");
        }
        System.out.println();
        int facSum=sumCalculate(arr);
        System.out.println("Sum of factors :"+facSum);
        int facPro=proCalculate(arr);
        System.out.println("Product of factors :"+facPro);
        int squreSum=squreCalculate(arr);
        System.out.println("Squresum of factors :"+squreSum);
      }
}
