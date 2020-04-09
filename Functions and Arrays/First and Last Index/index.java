import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int start = -1;
    int end = -1;
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    int count = 0;
    int num = scn.nextInt();
    for(int i=0;i<n;i++){
        if(arr[i]==num && count==0){
            start = i;
            end = i;
            count = 1;
        }
        else if(arr[i]==num && count==1){
            end = i;
        }
        
    }
    System.out.println(start);
    System.out.println(end);
    
    
 }

}