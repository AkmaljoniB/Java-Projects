package Codeforces;

import java.util.*;

public class Nearest_point {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s="NO";
            if(n==2){
                if(Math.abs(sc.nextInt()-sc.nextInt())>1)s="YES";
            }else{
                for(int i=0;i<n;i++)sc.nextInt();
            }
            System.out.println(s);
        }
    }
}