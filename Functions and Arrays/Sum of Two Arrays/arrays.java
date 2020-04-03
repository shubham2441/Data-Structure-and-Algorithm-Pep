import java.io.*;
import java.util.*;

public class Main{
    public static void insert(int[] arr,Scanner scn){
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        insert(arr1, scn);
    
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        insert(arr2,scn);
        
        sum(arr1,arr2);
    
    }
    
    public static void sum(int[] arr1,int[] arr2){
    int size1 = arr1.length;
    int size2 = arr2.length;
    int size = Math.max(size1,size2);
    
    int arr[] = new int[size];
    int i = size1-1;
    int j = size2-1;
    int carry = 0;
    int idx = size-1;
    
    while(i>=0 || j>=0){
        int d1 = i<0 ? 0 : arr1[i];
        int d2 = j<0 ? 0 : arr2[j];
        int sum = d1+d2+carry;
        //System.out.print(sum);
        if(sum>=10){
            carry = 1;
            sum = sum%10;
        }
        else{
            carry = 0;
        }
        arr[idx] = sum;
        i--;
        j--;
        idx--;
    }
    if(carry!=0){
        System.out.println(carry);
    }
    for(int k=0;k<arr.length;k++){
        System.out.println(arr[k]);
    }
    }
}