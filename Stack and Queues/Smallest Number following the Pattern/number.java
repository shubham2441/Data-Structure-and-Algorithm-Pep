import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // code
        int count = 1;
        String num = "";
        Stack < Integer > st = new Stack < > ();
        for (int i = 0; i <= str.length(); i++) {

            st.push(count);
            count = count + 1;

            while (!st.isEmpty() && (i == str.length() || str.charAt(i) == 'i')) {
                    num = num + st.pop();
                }
            }
            
            System.out.print(num);
        }
    }