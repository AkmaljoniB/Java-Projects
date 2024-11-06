package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class A_B_palindrome{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        PrintWriter pr=new PrintWriter(System.out);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0;
            long k=sc.nextLong();
            char[]arr=sc.next().toCharArray();
            for(int i=0;i<n;i++){
                if(arr[i]=='0'){
                    if(k>=l){
                        k-=l;
                        arr[i]='1';
                        arr[i-l]='0';
                    }else{
                        arr[i]='1';
                        arr[i-(int)k]='0';
                        break;
                    }
                }else l++;
            }
            for(int i=0;i<n;i++)pr.print(arr[i]);
            pr.println();
        }
        pr.close();
    }
}