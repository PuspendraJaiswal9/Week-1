import java.util.Scanner;

class Area{
       //Data Member
        private double radius;
        private double area;

        //Create Constructor
        public Area(double radius){
          area=Math.PI*(radius*radius);
        }
        public void display(){
            System.out.println("Total area :"+area);
        }
}

public class AreaFinder{
       public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a radius :");
          double radius=sc.nextDouble();
           
         //Create object
          Area arr=new Area(radius);
          arr.display();
       }
}