import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        if (n % 2 == 0) {
            int product = power(x, n / 2);
            System.out.print(product * product);
        } else {
            int product = power(x, (int) Math.floor(n / 2));
            System.out.print(product * product * x);
        }
    }
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }

    }


}