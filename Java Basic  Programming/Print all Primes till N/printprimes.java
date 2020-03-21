import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      
      
      
      int low  = scn.nextInt();
      int high = scn.nextInt();
      while(low<=high){
          int isPrime = 1;
          int n = low;
          int i;
          for(i=2;i*i<=n;i++){
              if(n%i==0){
                  
                  isPrime = 0;
                  break;
              }
          }
            if(isPrime==1){
                System.out.println(low);
            }      
          
        low = low+1;
      }
   }
  }