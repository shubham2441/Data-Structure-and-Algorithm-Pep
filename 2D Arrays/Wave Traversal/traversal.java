import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int arr[][] = new int[n1][n2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = scn.nextInt();

            }
        }

        int j = 0;
        while (true) {
            if (j < n2) {
                for (int i = 0; i < n1; i++) {
                    System.out.println(arr[i][j]);
                }
            } else {
                break;
            }

            j++;

            if (j < n2) {
                for (int i = n1 - 1; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }
            } else {
                break;
            }

            j++;
        }

    }

}