import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    
    for(int i=0;i<n;i++){
        int count = i+1;
        while(count<=n){
        for(int j=i;j<count;j++){
            System.out.print(arr[j]+"\t");
        }
        count++;
        System.out.println();
    }
    }
 }

}