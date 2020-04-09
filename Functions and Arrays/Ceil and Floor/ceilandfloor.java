import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int floor = -1;
        int ceil = -1;
        int num = scn.nextInt();
        int i = 0;
        while(arr[i]<=num){
            floor = arr[i]; 
            i++;
            if(floor==num){
                ceil = floor;
                break;
            }
            else{
                ceil = arr[i];
            }
            }
       
        System.out.println(ceil);
        System.out.println(floor);
    }

}