import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int coins[] = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        System.out.print(coinChangeCombi(coins, tar));
        System.out.println();


    }

    public static int coinChangeCombi(int[] coins, int tar) {
        int n = coins.length;

        int[] dp = new int[tar + 1];

        dp[0] = 1;


        for (int idx = 0; idx < coins.length; idx++) {
            int coin = coins[idx];

            for (int pos = coin; pos <= tar; pos++) {
                dp[pos] = dp[pos] + dp[pos - coin];
            }
        }
        return dp[tar];
    }
}