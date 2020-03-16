import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int low = n / 2;
        int high = n / 2 + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j >= low && j < high) || i == n / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            if (i < n / 2) {
                high = high + 1;

            } else {
                high = high - 1;
            }
            System.out.println();
        }
    }
}