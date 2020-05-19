import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();
        printKPC(n, "");
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


    public static void printKPC(String ques, String asf) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }
        
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        int keyIdx = Integer.parseInt(ch + "");

        String word = keys[keyIdx];
        for (int idx = 0; idx < word.length();idx++) {
            printKPC(roq, asf + word.charAt(idx));
        }
    }

}