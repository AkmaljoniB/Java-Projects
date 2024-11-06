package Codeforces;

import java.util.Scanner;

public class Stripped {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            String s=sc.next();
            StringBuilder sb=new StringBuilder(s.substring(0,k));
            if (s.substring(s.length()-k).contentEquals(sb.reverse())&&k*2<n)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}