import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int[] arr_g;
        int[] arr_s;
        int mult = 10;
        int n1 = scn.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr1 = new int[n2];
        for (int j = 0; j < n2; j++) {
            arr1[j] = scn.nextInt();
        }

        if (arr.length > arr1.length) {
            arr_g = arr;
            arr_s = arr1;
        } else {
            arr_g = arr1;
            arr_s = arr;
        }
        int borrow = 0;
        int i = arr_g.length - 1;
        int j = arr_s.length - 1;
        int[] arr_diff = new int[arr_g.length];
        int idx = arr_diff.length - 1;
        while (i >= 0 || j >= 0) {
            int d1 = i < 0 ? 0 : arr_g[i];
            int d2 = j < 0 ? 0 : arr_s[j];
            d1 = d1 - borrow;
            if (d1 < d2) {
                d1 = 10 + d1;
                borrow = 1;
            } else {
                borrow = 0;
            }
            int diff = d1 - d2;

            arr_diff[idx] = diff;
            i--;
            j--;
            idx--;
        }

        for (int k = 0; k < arr_diff.length; k++) {
            System.out.println(arr_diff[k]);
        }
    }

}