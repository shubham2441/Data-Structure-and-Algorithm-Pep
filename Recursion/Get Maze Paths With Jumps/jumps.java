import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
       
        System.out.print(printMazePaths(0, 0, n1 - 1, n2 - 1));

    }

    public static ArrayList < String > printMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList < String > base = new ArrayList < > ();
            base.add("");
            return base;
        }
        
        ArrayList < String > myresult = new ArrayList < > ();

        for (int jumps = 1; sc + jumps <= dc; jumps++) {

            ArrayList < String > horizontal = printMazePaths(sr, sc + jumps, dr, dc);
            for (String val: horizontal) {
                myresult.add("h" + jumps+val);
            }
        }

        for (int jumps = 1; sr + jumps <= dr; jumps++) {
            ArrayList < String > vertical = printMazePaths(sr + jumps, sc, dr, dc);
            for (String val: vertical) {
                myresult.add("v" +jumps+ val);
            }
        }

        for (int jumps = 1; sr + jumps <= dr && sc + jumps <= dc; jumps++) {

            ArrayList < String > diagonal = printMazePaths(sr + jumps, sc + jumps, dr, dc);
            for (String val: diagonal) {
                myresult.add("d" +jumps+ val);
            }
        }
        return myresult;

    }

}