package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class K_s_beautiful_line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pr = new PrintWriter(System.out);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt()-1;
            int a = n - 2, b = n - 1;
            while (b - a <= k) {
                k -= b - a;
                a--;
            }
            b-=k;
            for (int i = 0 ; i<n;i++){
                if (i!=a && i!=b) pr.print("a");
                else pr.print("b");
            }
            pr.println();
        }
        pr.close();
    }
}