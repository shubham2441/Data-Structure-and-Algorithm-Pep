import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
     
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int temp = n;
      for(int factor=2;factor*factor<=n;){
          while(temp%factor==0){
              System.out.print(factor + " ");
              temp /= factor;
          }
          factor += 1;
      }
      if(temp!=1){
          System.out.print(temp);
      }
     }
    }