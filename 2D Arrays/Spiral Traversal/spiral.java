import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int col_min = 0;
        int col_max = m-1 ;
        int row_min = 0;
        int row_max = n -1;
        int num = 0;
        while (num < n * m) {
            if (num < n * m) {
                for (int i = row_min; i <= row_max; i++) {
                    System.out.println(arr[i][col_min]);
                    num++;
                }col_min++;
            } else {
                break;
            }
            if (num < n * m) {
                for (int j = col_min; j <= col_max; j++) {
                    System.out.println(arr[row_max][j]);
                    num++;
                }row_max--;
            } else {
                break;
            }
            if (num < n * m) {
                for (int i = row_max; i >= row_min; i--) {
                    System.out.println(arr[i][col_max]);
                    num++;
                }col_max--;
            } else {
                break;
            }
            if (num < n * m) {
                for (int j = col_max; j >= col_min; j--) {
                    System.out.println(arr[row_min][j]);
                    num++;
                }row_min++;
            } else {
                break;
            }
        }
    }

}