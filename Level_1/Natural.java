import java.util.Scanner;
public class Natural{
       
       //Create Method.
       public void print(int number){
                                   
          //Check number is natural or not.
          if(number<=0){
            System.out.println("It is not natural number");
          }else{
               int ans=0;
               for(int i=1;i<=number;i++){
                  ans+=i;
               }
              System.out.println(number+" is a natural number and its sum "+ans); 
           }
       }

       public static void main(String args[]){
          
          // Create a Scanner object for user input 
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter number:");
          int number=sc.nextInt();
          
           // Create object.
           Natural obj=new Natural(); 
        
          //Method calls.
          obj.print(number);    
     }
}
