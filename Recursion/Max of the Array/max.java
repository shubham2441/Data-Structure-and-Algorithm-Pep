import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int idx = scn.nextInt();
        int arr[] = new int[idx];
        for (int i = 0; i < idx; i++) {
            arr[i] = scn.nextInt();
        }

        int max = 0; 
        System.out.print(maxOfArray(arr, idx - 1));
    }
    
    public static int maxOfArray(int[] arr, int idx) {
        if (idx == -1) {
            return -1;
        }
        int max = maxOfArray(arr,idx-1);
        if (arr[idx] > max) {
            max = arr[idx];
        }

        return max;

    }


}