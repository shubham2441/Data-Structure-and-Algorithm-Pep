import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
        if (max<=arr[i]){
            max = arr[i];
        }
        if(min>=arr[i]){
            min = arr[i];
        }
    }
    
    System.out.print(max-min);

 }

}