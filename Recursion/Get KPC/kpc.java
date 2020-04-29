import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();

        System.out.print(getKPC(input));

    }
    static String[] keys = {
        ".;",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tu",
        "vwx",
        "yz"
    };

    public static ArrayList < String > getKPC(String str) {
        if (str.length() == 0) {
            ArrayList < String > base = new ArrayList < > ();
            base.add("");
            return base;
        }
        ArrayList < String > recResult = getKPC(str.substring(1));
        ArrayList < String > myresult = new ArrayList < String > ();

        char ch = str.charAt(0);
        int keyIdx = Integer.parseInt(ch + "");
        String keyStr = keys[keyIdx];

        for (int i = 0; i < keyStr.length(); i++) {
            char ch_k = keyStr.charAt(i);
            for (String val: recResult) {
                myresult.add(ch_k + val);
            }
        }
        return myresult;
    }
}