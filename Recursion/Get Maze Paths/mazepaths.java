import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        System.out.print(getMazePaths(0, 0, n - 1, m - 1));

    }

    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList < String > base = new ArrayList < > ();
            base.add("");
            return base;
        }

        ArrayList < String > myResult = new ArrayList < > ();
        
        if (sc + 1 <= dc) {

            ArrayList < String > recResult = getMazePaths(sr, sc + 1, dr, dc);

            for (String val: recResult) {
                myResult.add("h" + val);
            }
        }

        if (sr + 1 <= dr) {
            ArrayList < String > recResult = getMazePaths(sr + 1, sc, dr, dc);
            for (String val: recResult) {
                myResult.add("v" + val);
            }

        }
        return myResult;


    }

}