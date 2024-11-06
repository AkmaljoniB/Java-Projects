package Codeforces;

import java.util.*;
public class Buying_torches {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt()-1,y=sc.nextInt(),k=sc.nextInt();
            long a= (long)y*k+k-1;
            a=a%x==0?a/x:a/x+1;
            System.out.println(a+k);
        }
    }
}