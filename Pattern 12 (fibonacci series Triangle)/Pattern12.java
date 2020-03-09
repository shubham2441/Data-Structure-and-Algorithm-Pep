import java.util.*;
     
     public class Main{
     
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
            int first = 0;
            int second = 1;
          for(int i=0;i<n;i++){
              for(int j=0;j<=i;j++){
                 System.out.print(first+"\t");
                 int third = first+second;
                 first = second;
                 second = third;
              }
              System.out.println();
          }
     
      }
     }