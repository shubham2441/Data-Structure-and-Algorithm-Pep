import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {

        int remain = 0;
        int result = 0;
        int mul = 1;
        while (n1 != 0 || n2 != 0 || remain != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            d2 = d2 - remain;
            if (d1 > d2) {
                d2 = d2 + b;
                int diff = d2 - d1;
                result = result + (mul * diff);
                remain = 1;
                mul = mul * 10;
            } else {
                int diff = d2 - d1;
                result = result + (mul * diff);
                remain = 0;
                mul = mul * 10;
            }
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        return result;
    }
}