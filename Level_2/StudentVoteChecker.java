import java.util.Scanner;
public class StudentVoteChecker {
         //Create Method.
         public boolean canStudentVote(int age){

             if(age>=18){
               return true;
             }else{
               return false;
             }  
         }

         public static void main(String args[]){
          //Create Scanner object for user input.
            Scanner sc=new Scanner(System.in);
            
           //Create array of 10 student.
            int[] arr=new int[10];

            for(int i=0;i<10;i++){
               System.out.println("Enter age of "+(i+1)+" student :");
               arr[i]=sc.nextInt();
            }

            //Create object.
              StudentVoteChecker obj=new StudentVoteChecker();

            //check age is greater than 18 or not.
            for(int i=0;i<10;i++){
              if(obj.canStudentVote(arr[i])){
                 System.out.println("Studnet "+(i+1)+" can vote becouse age is : "+ arr[i]);
              }else{
                 System.out.println("Studnet "+(i+1)+" can not vote becouse age is : "+arr[i]);
              }
            }
         }
 }