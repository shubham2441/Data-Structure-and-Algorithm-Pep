import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int low = 1;
        int high = 2 * n - 2;

        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j < low && j <= (2 * n - 1) / 2) {
                    k++;
                } else if (j > high && j > (2 * n - 1) / 2) {
                    k--;
                }

                if (j >= low && j < high) {
                    System.out.print("\t");
                } else {
                    System.out.print(k + "\t");
                }


            }
            high = high - 1;
            low = low + 1;
            System.out.println();
        }
    }
}