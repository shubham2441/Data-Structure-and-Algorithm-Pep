import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int pow = power(x, n);
        System.out.print(pow);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            int temp = power(x, n / 2);
            return temp * temp;
        } else {
            int temp = power(x, n / 2);
            return x * temp * temp;
        }
    }

}