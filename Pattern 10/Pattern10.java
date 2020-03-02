import java.util.*;
               
               public class Main{
               
               public static void main(String[] args) {
                   Scanner scn = new Scanner(System.in);
               
                   int n = scn.nextInt();
                   int low = n/2;
                   int high = n/2;
                   
                   for(int i=0;i<=n/2;i++){
                       for(int j=0;j<n;j++){
                         if(j==low || j==high){
                           System.out.print("*\t");
                           }
                         else{
                            System.out.print("\t");
                            }
                        }
                         if(low>=0 && high<n){
                           low = low-1;
                           high = high+1;
                        }
                        
                    System.out.println();   
                    }
                    high = high-1-1;
                    low = low+1+1;
                   for(int i=0;i<n/2;i++){
                       for(int j=0;j<n;j++){
                         if(j==low || j==high){
                           System.out.print("*\t");
                           }
                         else{
                            System.out.print("\t");
                            }
                        }
                         if(low<=n && high>0){
                           low = low+1;
                           high = high-1;
                        }
                        
                    System.out.println();   
                    }
                   
               
                }
               }