import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] arr = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] arr1 = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arr1[i][j] = scn.nextInt();
            }
        
        }
        int[][] multiplication = new int[n1][m2];
        if(m1==n2){
            
            for (int i = 0; i < n1; i++) {
                
                for (int j = 0; j < m2; j++) {
                int sum = 0;    
                    for(int k = 0;k<m1;k++){
                    sum = sum + arr[i][k]*arr1[k][j];
                }
                multiplication[i][j] = sum;
                }
            }
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    System.out.print(multiplication[i][j]+" ");
                }
                System.out.println();
                
            }
        }
        else{
            System.out.println("Invalid input");
        }
        
    }

}