import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= k) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            k = k - 1;
            System.out.println();
        }
    }
}