import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int d = getValue(n, b1, b2);
        System.out.println(d);
    }

    public static int getValueInBase(int n, int b) {
        int mult = 1;
        int binary = 0;
        while (n != 0) {
            int temp = n % b;
            n = n / b;
            binary = binary + mult * temp;
            mult = mult * 10;
        }
        return binary;
    }

    public static int getValueIndecimal(int n, int b) {
        int sum = 0;
        int temp = 1;
        while (n != 0) {
            int temp_digit = n % 10;
            sum = sum + (temp_digit * temp);
            n = n / 10;
            temp = temp * b;
        }
        return sum;
    }

    public static int getValue(int n, int b1, int b2) {
       int intermediate = getValueIndecimal(n, b1);
       int result = getValueInBase(intermediate, b2);
       
       return result;

    }
}