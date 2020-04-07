import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
      int[] b = new int[a.length];
    for(int i=0;i<a.length;i++){
        b[a[i]] = i;
    }
    
    for(int i=0;i<a.length;i++){
        System.out.println(b[i]);
    }
    
    return null;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    
 }

}