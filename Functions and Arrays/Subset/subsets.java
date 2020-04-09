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
        printSubsets(arr);
    }


public static void printSubsets(int arr[]) {
    int n = arr.length;

    int totalSubset = (int) Math.pow(2, n);
    for (int i = 0; i < totalSubset; i++) {
        int k = 0;
        int idx = ;
        String ans = "";
        int temp = i;
        while (k < n) {
            
            int rem = temp % 2;
            temp = temp / 2;
            k++;
            
            if (rem == 0) {
                ans = "-"+"\t" + ans;
            } else {
                ans = arr[idx]+"\t" + ans;
            }
            idx--;
           
        }
        System.out.println(ans);
    }

}
}