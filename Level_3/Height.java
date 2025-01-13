import java.util.Scanner;
public class Height{

       //Create Method sum of all Players heights
       public static int add(int[] heights){
           int sum=0;
           for(int i=0;i<heights.length;i++){
              sum+=heights[i];
           }
           return sum;
       }
       
       //Create Method find mean.
        public static int findMean(int sumOfAllPlayers,int totalNumberOfPlayers){
            return sumOfAllPlayers/totalNumberOfPlayers;
        }

        //Create Method find shortest height.
        public static int shortestHeight(int[] heights){
          int minHeight=heights[0];
             for(int i=1;i<heights.length;i++){
                if(minHeight>heights[i]){
                   minHeight=heights[i];
                }
            }
           return minHeight;
        }

         //Create Method find tallest height.
        public static int tallestHeight(int[] heights){
          int maxHeight=heights[0];
             for(int i=1;i<heights.length;i++){
                if(maxHeight<heights[i]){
                   maxHeight=heights[i];
                }
            }
           return maxHeight;
        }


       public static void main(String args[]){
        //Create a scanner object for user input.
          Scanner sc=new Scanner(System.in);

           System.out.println("Enter number of players:");
           int n=sc.nextInt();
           //Create array name heights of 11 size.
           int[] heights=new int[n];

          //take inputs in 3 digits in the range 150 cms to 250 cms
           for(int i=0;i<heights.length;i++){
              System.out.println("Enter height of "+(i+1)+" player :");
              heights[i]=sc.nextInt();
           }

           int sumOfAllPlayers=add(heights);
           int meanHeight=findMean(sumOfAllPlayers,n);
           System.out.println("Mean height of "+n+" players is "+meanHeight);

           int minHeight=shortestHeight(heights);
           System.out.println("shortest Height is :"+minHeight);

           int maxHeight=tallestHeight(heights);
           System.out.println("tallest Height is :"+maxHeight);
           
      }
}