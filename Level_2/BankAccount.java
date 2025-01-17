import java.util.Scanner;
class Bank{
      //Data Member
        private String accountHolder;
        private long accountNumber;
        private float balance;
        public Bank(String accountHolder,long accountNumber,float balance){
                this.accountHolder=accountHolder;
                this.accountNumber=accountNumber;
                this.balance=balance;
        }

        public void display(){
           System.out.println("accountHolder :"+accountHolder);
           System.out.println("accountNumber  :"+accountNumber);
           System.out.println("balance :"+balance);
       }
       //Create Method deposite money
       public void deposit(float money){
              balance+=money;      
       }  
       //Create Method withdraw money
       public void withdraw(float money){
              balance-=money;      
       }  

}

public class BankAccount{
       public static void main(String str[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a accountHolder:");
         String accountHolder=sc.nextLine();
         System.out.println("Enter a accountNumber:");
         long accountNumber=sc.nextLong();
         System.out.println("Enter a balance:");
         float balance=sc.nextFloat();

         //Create Object
           Bank b=new Bank(accountHolder,accountNumber,balance);
           b.display();
           System.out.println("If you want to deposite money enter 1 otherwise enter 2:");
           int num=sc.nextInt();
           if(num==1){
           System.out.println("Enter a deposit money:");
           float depos=sc.nextFloat();
           b.deposit(depos); 
           b.display();
           }else{
                 System.out.println("Thankyou");
           }

           System.out.println("If you want to withdra money enter 1 otherwise enter 2:");
           int num1=sc.nextInt();
           if(num1==1){
           System.out.println("Enter withdra money:");
           float withdra=sc.nextFloat();
           b.withdraw(withdra); 
           b.display();
           }else{
                 System.out.println("Thankyou");
           }

       }
}