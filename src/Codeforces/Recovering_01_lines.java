package Codeforces;

import java.util.Scanner;

public class Recovering_01_lines {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n0=sc.nextInt(),n1=sc.nextInt(),n2=sc.nextInt();
            StringBuilder sb=new StringBuilder();
            if (n0!=0)sb.append("0");
            sb.append("0".repeat(n0));
            if (n2!=0)sb.append("1");
            sb.append("1".repeat(n2));
            if (n1!=0) {
                if (n0!=0&&n2!=0)n1--;
                else if (n0==0&&n2==0) sb.append("1");
                else if (n0!=0) {
                    sb.append("1");
                    n1--;
                }
                for (int i=0;i<n1;i++)sb.append(i%2);
            }
            System.out.println(sb);
        }
    }
}