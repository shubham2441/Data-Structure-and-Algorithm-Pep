  import java.util.*;
  
  public class Main{
      
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int t  = scn.nextInt();
            
        while(t!=0){
            int isPrime = 1;
            int n = scn.nextInt();
            
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    isPrime=0;
                    System.out.println("not prime");
                    break;
                }
            }
            if(isPrime==1){
                System.out.println("prime");
                }
            
           
            t = t-1;
        }
    
    }
}
