package Codeforces;

import java.util.Scanner;

public class And_0_larg_amount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt();long s=1;
            for (int i=1;i<=k;i++) s=(s*n)%1000000007;
            System.out.println(s);
        }
    }
}