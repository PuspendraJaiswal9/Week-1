import java.util.Scanner;
public class Spring{
       
       //Create Method.
       public void Check(int month,int day){
                                   
          //Check Spring Season.
          if(month==3 && day>=20 && day<=31){
            System.out.println("Its a Spring Season");
          }else if(month==4 && day>=1 && day<=30){
            System.out.println("Its a Spring Season");
           }else if(month==5 && day>=1 && day<=31){
              System.out.println("Its a Spring Season");
           }else if(month==6 && day>=1 && day<=20){
              System.out.println("Its a Spring Season");
           }else{
               System.out.println("Its not Spring Season");
           }
       }

       public static void main(String args[]){
          
          // Create a Scanner object for user input 
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter month:");
          int month=sc.nextInt();
          System.out.println("Enter Day:");
          int day=sc.nextInt();


           // Create object.
           Spring obj=new Spring(); 
        
          //Method calls.
          obj.Check(month,day);    
     }
}
