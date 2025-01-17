import java.util.Scanner;
class Book{
      //Data Member
        String title;
        String author;
        double price;
        public Book(String title,String author,double price){
                this.title=title;
                this.author=author;
                this.price=price;
        }

       public void display(){
           System.out.println("title :"+title);
           System.out.println("author name :"+author);
           System.out.println("price :"+price);
       }  
}

public class BookDetails{
       public static void main(String str[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a title:");
         String title=sc.nextLine();
         System.out.println("Enter a author:");
         String author=sc.nextLine();
         System.out.println("Enter a price:");
         double price=sc.nextDouble();

         //Create Object
           Book b=new Book(title,author,price);
           b.display(); 
       }
}