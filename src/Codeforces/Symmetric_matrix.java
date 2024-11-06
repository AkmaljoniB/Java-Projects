package Codeforces;

import java.util.Scanner;

public class Symmetric_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            String s="NO";
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
                if (b == c) s = "YES";
            }
            if (m%2!=0)s="NO";
            System.out.println(s);
        }
    }
}