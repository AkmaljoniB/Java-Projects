package Codeforces;

import java.util.Scanner;

public class Long_comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long x1 = scanner.nextInt();
            int p1 = scanner.nextInt();
            long x2 = scanner.nextInt();
            int p2 = scanner.nextInt();
            int min = Math.min(p1, p2);
            p1 -= min;
            p2 -= min;
            x1 *= Math.pow(10, p1);
            x2 *= Math.pow(10, p2);
            if (x1 > x2) System.out.println(">");
            else if (x1 < x2) System.out.println("<");
            else System.out.println("=");
        }
    }
}
