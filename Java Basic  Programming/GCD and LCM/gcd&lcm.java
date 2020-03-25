import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      int product = m*n;
     
      int lcm = 1;
      int factor = 2;
      while(n!=1 || m!=1){
         
          while(n%factor==0 && m%factor==0){
             lcm = lcm*factor;
             n = n/factor;
             m = m/factor;
          }
          while(n%factor==0 && m%factor!=0){
             lcm = lcm*factor;
             n = n/factor; 
          }
          while(n%factor!=0 && m%factor==0){
             lcm = lcm*factor;
             m = m/factor; 
          }
          
          factor = factor+1;
      }
      
      int gcd = product/lcm; 
         
         System.out.println(gcd);
         System.out.print(lcm);
      
     }
    }
    
    