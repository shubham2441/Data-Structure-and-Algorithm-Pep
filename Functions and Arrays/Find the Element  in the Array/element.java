import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    int flag = 0;
    
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    
    int m = scn.nextInt();
    
    for(int i=0;i<n;i++){
        if(arr[i]==m){
            System.out.print(i);
            flag = 1;
            break;
        }
    }
    if(flag==0){
        System.out.print("-1");
    }
 }

}