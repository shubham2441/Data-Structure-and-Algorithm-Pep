import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {

                if (j > k) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            k = k + 1;
        }

    }
}