import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = scn.nextInt();
            }
        }
        rotate(mat);
        display(mat);
    }
    public static void rotate(int mat[][]){
        int n = mat[0].length;
            transpose(mat);
        for(int row=0;row<n;row++){
            reverse(mat,row);
        }
    }
    public static void transpose(int mat[][]){
        int n = mat.length;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                int temp  =  mat[j][j+i];
                mat[j][j+i] = mat[j+i][j];
                mat[j+i][j] = temp;
                
            }
        }
    }
    public static void reverse(int mat[][], int rowNo){
        int st = 0;
        int ed = mat[0].length-1;
        while(st<ed){
            int temp = mat[rowNo][st];
            mat[rowNo][st]  = mat[rowNo][ed];
            mat[rowNo][ed] = temp;
            st++;
            ed--;
    }
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
