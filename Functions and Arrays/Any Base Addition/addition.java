import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        int num = 0;
        int carry = 0;
        int mult = 1;

        while (n1 != 0 || n2 != 0 || carry != 0) {
            int temp1 = n1 % 10;
            int temp2 = n2 % 10;

            if ((temp1 + temp2 + carry) >= b) {
                int sum = temp1 + temp2 + carry;
                carry = sum / b;
                int temp = sum % b;
                num = num + (mult * temp);

            } else {
                int sum = temp1 + temp2 + carry;
                num = num + (mult * sum);
                carry = sum/b;
            }
            n1 = n1 / 10;
            n2 = n2 / 10;
            mult = mult * 10;
        }

        return num;
    }

}