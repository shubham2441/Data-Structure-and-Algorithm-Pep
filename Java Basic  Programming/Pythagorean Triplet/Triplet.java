import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    boolean result=(a*a==(b*b + c*c)) || (b*b==(a*a + c*c)) || (c*c==(b*b + a*a));
   
    System.out.print(result);
    
   }
  }