import java.util.Scanner;
public class NumberCheck{
       
       //Create Method.
       public int Check(int number){
                                   
          //Check Number.
          if(number==0){
            return 0;
          }else if(number<0){
             return -1;
          }else{
             return 1;
          }
       }

       public static void main(String args[]){
          
          // Create a Scanner object for user input 
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter number:");
          int number=sc.nextInt();

           // Create object.
           NumberCheck obj=new NumberCheck(); 
        
          //Method calls.
          int ans=obj.Check(number);
          
          //output Display
           System.out.println(ans);     
     }
}
