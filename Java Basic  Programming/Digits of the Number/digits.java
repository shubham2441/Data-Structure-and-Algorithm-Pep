import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int temp = n;
    int ten = 1;
    int count = 0;
    int temp2 = 0;
    while(temp!=0){
        count = count+1;
        temp = temp/10;
    }
    for(int i=0;i<count-1;i++){
        ten = ten*10;
    }
    while(ten!=0){
        int temp1 = n/ten;
        n = n%ten;
        ten = ten/10;
        System.out.println(temp1);
        temp2 = temp2+1;
    }
    
     }
    }