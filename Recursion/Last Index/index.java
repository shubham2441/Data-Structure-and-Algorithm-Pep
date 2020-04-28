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
        int x = scn.nextInt();
        System.out.print(lastIndex(arr, 0, x));

    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }

        int forwardIdx = lastIndex(arr, idx + 1, x);

        if (forwardIdx == -1) {
            if (arr[idx] == x) {
                return idx;
            }
            return -1;
        }
        else{
            return forwardIdx;
        }
        
    }

}