import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(getStairPaths(n));

    }

    public static ArrayList < String > getStairPaths(int n) {

        if (n == 0) {
            ArrayList < String > base = new ArrayList < > ();
            base.add("");
            return base;
        }

        ArrayList < String > myresult = new ArrayList < > ();

        if (n - 1 >= 0) {
            ArrayList < String > len1 = getStairPaths(n - 1);
            for (String val: len1) {
                myresult.add("1" + val);
            }

            if (n - 2 >= 0) {
                ArrayList < String > len2 = getStairPaths(n - 2);
                for (String val: len2) {
                    myresult.add("2" + val);
                }

                if (n - 3 >= 0) {
                    ArrayList < String > len3 = getStairPaths(n - 3);
                    for (String val: len3) {
                        myresult.add("3" + val);
                    }
                }
            }
        }
        return myresult;
    }
}