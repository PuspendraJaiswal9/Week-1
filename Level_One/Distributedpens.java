public class DistributedPens{
       public static void main(String args[]){
         // Create Variable totalPens.
         int totalPens=14;

         // Create Variable totalStudents.
         int totalStudents=3;

         // Calculate distributedPen.
         int distributedPen=(totalPens/totalStudents);

         // Calculate nonDistributedPen.
         int nonDistributedPen=(totalPens%totalStudents);
         System.out.println("The Pen Per Student is "+distributedPen+" and the remaining pen not distributed is "+nonDistributedPen);
       }
}