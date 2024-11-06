package Codeforces;

import java.util.Scanner;

public class Least_product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),l=0,p=0;
            for (int i=0;i<n;i++) {
                int a=sc.nextInt();
                if (a==0)p++;
                if (a<0)l++;
            }
            if (l%2!=0||p!=0) System.out.println(0);
            else System.out.println(1+"\n1 0");
        }
    }
}
