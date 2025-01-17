import java.util.Scanner;
class Mobile{
      //Data Member
        String brand;
        String model;
        double price;
        public Mobile(String brand,String model,double price){
                this.brand=brand;
                this.model=model;
                this.price=price;
        }

       public void display(){
           System.out.println("brand :"+brand);
           System.out.println("model name :"+model);
           System.out.println("price :"+price);
       }  
}

public class MobilePhone{
       public static void main(String str[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a brand:");
         String brand=sc.nextLine();
         System.out.println("Enter a  model:");
         String model=sc.nextLine();
         System.out.println("Enter a price:");
         double price=sc.nextDouble();

         //Create Object
           Mobile b=new Mobile(brand,model,price);
           b.display(); 
       }
}