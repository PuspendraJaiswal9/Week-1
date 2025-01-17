import java.util.Scanner;
class Checker{
       private String str;
       public Checker(String str){
           this.str=str;
       }
       
       //Create method 
       public boolean isPalindrom(){
              int i=0;int j=str.length()-1;
              while(i<=j){
                  if(str.charAt(i)!=str.charAt(j)){
                       return false;
                  }
                  i++;
                  j--;
              }
             return true;
       }
       
}

public class Palindrom{
       public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();

        //Create object.
        Checker ch=new Checker(str);
          if(ch.isPalindrom()){
                System.out.println("Yes String is Pallindrom:");
          }else{
                System.out.println("No String is not Pallindrom:");
            }
       }
}