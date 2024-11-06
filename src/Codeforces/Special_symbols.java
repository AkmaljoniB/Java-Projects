package Codeforces;

import java.util.Scanner;

public class Special_symbols {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            if (n%2!=0) System.out.println("NO");
            else {
                System.out.println("YES");
                StringBuilder sb = new StringBuilder();
                sb.append("AAB".repeat(n/2));
                System.out.println(sb);
            }
        }
    }
}
