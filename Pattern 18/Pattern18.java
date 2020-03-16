import java.util.*;
      
      public class Main{
      
      public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int low = 0;
         int high = n;
         
         for(int i=0;i<n/2+1;i++){
             for(int j=0;j<n;j++){
                 if(j==low || j==high-1 ||i==0){
                 System.out.print("*\t");
             }
             else{
                 System.out.print("\t");
             }
             
             }
             System.out.println();
             
             low = low+1;
             high = high-1;
         }
         low = low-2;
         high = high+2;
         for(int i=0;i<n/2;i++){
             for(int j=0;j<n;j++){
                 if(j>=low && j<high){
                 System.out.print("*\t");
                 }
                 else{
                     System.out.print("\t");
                 }
             }
             System.out.println();
             
                 low = low-1;
                 high = high+1;
         }
       }
      }