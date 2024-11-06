package Codeforces;

import java.util.Scanner;

public class Bad_boy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int x1 = i - 1 < n - i ? 1 : n, y1=j - 1 < m - j?1:m, x2 = i - 1 < n - i ? n : 1, y2=j - 1 < m - j?m:1;
            System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
        }
    }
}
