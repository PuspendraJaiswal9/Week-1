import java.util.Scanner;
class Student{
      //Data Member
      private String name;
      private int rollNumber;
      private int[] marks;
      private int totalmarks;
      // Create Constructor
      public Student(String name,int rollNumber,int[] marks){
            this.name=name;
            this.rollNumber=rollNumber;
            this.marks=marks;
            for(int i=0;i<5;i++){
                totalmarks+=marks[i];
            }
      }
       
      public void display(){
          System.out.println("name is :"+name);
          System.out.println("rollNumber is :"+rollNumber);
          System.out.println("marks is :"+totalmarks);
          if(totalmarks>=80){
            System.out.println("Grade is :"+'A');
          }else if(totalmarks>=65){
            System.out.println("Grade is :"+'B');
          }else if(totalmarks>=45){
            System.out.println("Grade is :"+'C');
          }else{
            System.out.println("Grade is :"+'D');
          }

      }


      
}

public class StudentDetails{
       public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter name:");
          String name=sc.nextLine();
          System.out.println("Enter rollNumber:");
          int rollNumber=sc.nextInt();
          System.out.println("Enter marks of 5 subject Hindi , English, Math, physics, Chamestry:");
          int[] marks=new int[5];
          for(int i=0;i<5;i++){
               marks[i]=sc.nextInt();
          }
          // Create object
             Student st=new Student(name,rollNumber,marks);
             st.display();
       }
}