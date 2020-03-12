import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int low = n / 2;
        int high = low + 1;
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (j >= low && j < high) {
                    if (j <= n / 2) {
                        k = k + 1;
                    } else {
                        k = k - 1;
                    }
                    System.out.print(k + "\t");
                } else {
                    System.out.print("\t");
                }

            }
            if (i >= n / 2) {
                k = k - 2;
            }

            if (i < n / 2) {
                low = low - 1;
                high = high + 1;
            } else {
                low = low + 1;
                high = high - 1;
            }
            System.out.println();
        }

    }
}