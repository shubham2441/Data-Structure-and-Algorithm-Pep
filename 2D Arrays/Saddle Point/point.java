import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int col = 0;
        int row = 0;
        int print = 0;
        for (int k = 0; k < n; k++) {
            int min = Integer.MAX_VALUE;
            int flag = 0;
            for (int i = 0; i < n; i++) {
               
                if (min > arr[col][i]) {
                    min = arr[col][i];
                    row = i;
                }
            }
            int num = min;
            col++;
           
            
            for (int j = 0; j < n; j++) {
                if (num < arr[j][row]) {
                    flag = 1;
                    break;
                }
            }
            
            if (flag == 0) {
                System.out.print(num);
                print = 1;
            }
        }
        if(print==0){
                System.out.print("Invalid input");
            }
    }
}