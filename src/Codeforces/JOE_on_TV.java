package Codeforces;

import java.util.Scanner;

public class JOE_on_TV {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double s=1;
        for (double i=2;i<=n;i++)s+= 1 /i;
        String p=String.format("%.12f",s);
        System.out.println(p.replace(",","."));
    }
}
