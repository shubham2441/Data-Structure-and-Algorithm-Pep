import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

      
        System.out.print(kPart(n, k));

    }

    public static long kPart(int n, int k) {

        long dp[][] = new long[k + 1][n + 1];

        for (int i = 1; i <= k; i++) {
            for (int j = i; j <= n; j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + i * (dp[i][j - 1]);
                }
            }
        }
        return dp[k][n];
    }
}