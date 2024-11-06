package Codeforces;

import java.util.Scanner;

public class Quintomania {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),a=sc.nextInt();
            String s="YES";
            for(int i=1;i<n;i++){
                int b=sc.nextInt();
                if(Math.abs(b-a)!=5&&Math.abs(b-a)!=7)s="NO";
                a=b;
            }
            System.out.println(s);
        }
    }
}