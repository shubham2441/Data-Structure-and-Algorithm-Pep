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

  public static void rotate(int[] a, int k){
   
    if(Math.abs(k)>a.length){
    k = k%a.length;}
     if(k<0){
        k = a.length+k;
    }
    int y= 0;
    int g = a.length-k;
    int[] b = new int[g+1];
    for(int i=0;i<g+1;i++){
        b[i] = a[i];
        y = i;
    }
    int m = 0;
    for(int j=y;j<a.length;j++){
        a[m] = a[j];
        m = m+1;
    }
    int h = 0;
    for(int l=m;l<a.length;l++){
        a[l] = b[h];
        h = h+1;
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}