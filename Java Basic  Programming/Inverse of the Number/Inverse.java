import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
    
         int num = scn.nextInt();
         int rv = 0;
         int pos = 1;
         
         while(num!=0){
             int val = num%10;
             int mul = (int)Math.pow(10,val-1);
             
             rv = rv + (mul*pos);
             pos += 1;
             num /= 10;
             
         }
         System.out.print(rv);
        }
    }