import java.io.*;
import java.util.*;

public class Main {

    static class pair implements Comparable<pair> {
        int width;
        int height;
        
        public int compareTo(pair other){
            if(this.width != other.width){
                return this.width  - other.width;
            } else{
                return this.height - other.height;
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pair[] envelopes = new pair[n];

        for (int i = 0; i < n; i++) {
            pair envelope = new pair();
            envelope.width = scn.nextInt();
            envelope.height = scn.nextInt();

            envelopes[i] = envelope;
        }

        Arrays.sort(envelopes);

        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (envelopes[i].height > envelopes[j].height && max < dp[j]) {
                    max = dp[j];
                }
            }
            
            dp[i] = max + 1;
        }
        
        int lis = dp[0];
        
        for(int i=1;i<n;i++){
            if(lis<dp[i]){
                lis = dp[i];
            }
        }
        
        System.out.print(lis);
    }

}