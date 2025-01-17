import java.util.Scanner;
class Track{
      //Data Member
        String itemCode;
        String itemName;
        double price;
        public Track(String itemCode,String itemName,double price){
                this.itemCode=itemCode;
                this.itemName=itemName;
                this.price=price;
        }

       public void display(){
           System.out.println("itemCode :"+itemCode);
           System.out.println("itemName name :"+itemName);
           System.out.println("price :"+price);
       }  
}

public class TrackInventory{
       public static void main(String str[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a itemCode:");
         String itemCode=sc.nextLine();
         System.out.println("Enter a itemName:");
         String itemName=sc.nextLine();
         System.out.println("Enter a price:");
         double price=sc.nextDouble();
         System.out.println("Enter quantity:");
         int quantity=sc.nextInt();


         //Create Object
           Track b=new Track(itemCode,itemName,price);
           b.display(); 

          System.out.println("Total cost is :" + quantity * b.price);
       }
}