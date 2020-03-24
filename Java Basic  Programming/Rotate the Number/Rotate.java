import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int num = scn.nextInt();
     int r = scn.nextInt();
     int count = 0;
     int num1 = num;
     
     while(num!=0){
        num = num/10;
        count = count+1;
        }
     if(Math.abs(r)>count){
        r = r%count;
        }
     if(r<0){
         r = count+r;  
         
     }
        
     for(int i=0;i<r;i++){
        
        int mul = (int)Math.pow(10,count-1);
        int temp = num1%10;
        num1 = num1/10;
        num1 = (mul*temp)+num1;
          }
    System.out.print(num1);
    }
   }