import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scn.nextInt();
        }
        int target = scn.nextInt();

        System.out.print(coinChangePermRec(coins, target));

    }

    public static int coinChangePermRec(int[] coins, int target) {

        if (target == 0) {
            return 1;
        }
        
        int perm = 0;
        for (int i = 0; i < coins.length && target - coins[i] >= 0; i++) {
            if(coins[i]!=0){
            perm = perm + coinChangePermRec(coins, target - coins[i]);
            }
        }

        return perm;
    }

    public static int coinChangePerm(int[] coins, int target) {
        int size = coins.length;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int pos = 1; pos <= target; pos++) {
            for (int coin = 0; coin < size; coin++) {
                if (pos - coins[coin] >= 0) {
                    dp[pos] = dp[pos] + dp[pos - coins[coin]];
                }
            }
        }
        return dp[target];
    }
}
