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
        displayArr(arr, idx - 1);
    }

    public static void displayArr(int[] arr, int idx) {
        if (idx == -1) {
            return;
        }

        displayArr(arr, idx - 1);
        System.out.println(arr[idx]);
    }

} 