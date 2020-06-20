import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        printPermutations(str,"");

    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        for(int idx=0;idx<str.length();idx++){
            char ch = str.charAt(idx);
            
            String left = str.substring(0,idx);
            String right = str.substring(idx+1); 
            
            String roq = left + right;
            
            printPermutations(roq,asf+ch);
        }
        
    }

}