import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }
    public static int convert(int b, int n){
        int decimal = 0;
        int power = 0;
        while(n>0){
            int d = n%10;
            decimal = decimal + d*(int)Math.pow(b,power);
            n = n/10;
            power = power + 1;
            
        }
        return decimal;
    }
    
    public static int productConvert(int product, int b){
        int n = 0;
        int mult = 1;
        while(product>0){
            int temp = product%b;
            n = n + mult*temp;
            product = product/b;
            mult = mult*10;
        }
        return n;
    }
    public static int getProduct(int b, int n1, int n2) {
        int m1 = convert(b,n1);
        int m2 = convert(b,n2);
        int product = m1*m2;
        int final_ans = productConvert(product, b);
        return final_ans;
    }

}