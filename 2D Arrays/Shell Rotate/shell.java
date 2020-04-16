import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int mat[][] = new int[n1][n2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        int shellno = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = fill1d(mat, shellno);
        shellrotate(mat, shellno, k, arr);

    }

    public static void shellrotate(int mat[][], int shellno, int k, int[] arr) {

        rotate(arr, k);

        fill2d(mat, shellno, arr);
    }

    public static int[] fill1d(int mat[][], int shellno) {
        int n = mat.length;
        int m = mat[0].length;

        int shellLen = m - 2 * (shellno - 1);
        int shellCol = n - 2 * (shellno - 1);

        int totalElements = 2 * (shellLen + shellCol) - 4;

        int[] shellElements = new int[totalElements];

        int startr = shellno - 1, startc = shellno - 1;
        int endr = n - 1 - (shellno - 1), endc = m - 1 - (shellno - 1);

        int idx = 0;

        for (int i = startr; i <= endr; i++) {
            shellElements[idx] = mat[i][startc];
            idx++;
        }
        startc++;
        for (int j = startc; j <= endc; j++) {
            shellElements[idx] = mat[endr][j];
            idx++;
        }
        endr--;

        for (int i = endr; i >= startr; i--) {
            shellElements[idx] = mat[i][endc];
            idx++;

        }

        endc--;
        for (int j = endc; j >= startc; j--) {
            shellElements[idx] = mat[startr][j];
            idx++;
        }
        return shellElements;
    }




    public static void rotate(int arr[], int k) {
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, 0, arr.length - 1);

    }

    public static void reverse(int arr[], int st, int ed) {
        while (st < ed) {
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;

            st++;
            ed--;
        }

    }

    public static void fill2d(int[][] mat, int shellno, int[] shellElements) {

        int n = mat.length;
        int m = mat[0].length;
        int startr = shellno - 1;
        int startc = shellno - 1;
        int endr = n - shellno;
        int endc = m - shellno;

        int idx = 0;
        //left wall
        for (int i = startr; i <= endr; i++) {
            mat[i][startc] = shellElements[idx];
            idx++;
        }
        startc++;
        for (int j = startc; j <= endc; j++) {
            mat[endr][j] = shellElements[idx];
            idx++;
        }
        endr--;

        for (int i = endr; i >= startr; i--) {
            mat[i][endc] = shellElements[idx];
            idx++;

        }

        endc--;
        for (int j = endc; j >= startc; j--) {
            mat[startr][j] = shellElements[idx];
            idx++;
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}