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
    exit(arr,m,n);
    }

    public static void exit(int arr[][],int m,int n) {
        int dir = 0;
        int row = 0;
        int col = 0;

        while (true) {
            dir = (dir + arr[row][col])%4;
            if (dir == 0) {
                col++;
            } 
            else if (dir == 1) {
                row++;
            } 
            else if (dir == 2) {
                col--;
            }
            else {
                row--;
            }
            
            if(col==m){
                col--;
                break;
            }
            else if(row==n){
                row--;
                break;
            }
            else if(col==-1){
                col++;
                break;
            }
            else if(row==-1){
                row++;
                break;
            }
        }
        System.out.println(row);
        System.out.println(col);
        
    }
}

    