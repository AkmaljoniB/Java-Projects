package Codeforces;

import java.util.Scanner;

public class Statistics_by_level {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            int c = scanner.nextInt();
            String s="YES";
            for (int i = 1; i < n; i++) {
                int a =scanner.nextInt();
                int b =scanner.nextInt();
                if (a<p||b<c||a<b||b-c>a-p)s="NO";
                p=a;
                c=b;
            }
            if (c>p)s="NO";
            System.out.println(s);
        }
    }
}
