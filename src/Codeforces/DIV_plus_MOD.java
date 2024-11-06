package Codeforces;

import java.util.Scanner;

public class DIV_plus_MOD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int a = scanner.nextInt();
            int max = r / a + r % a;
            int x = r - r % a - 1;
            if (x >= l && x <= r) max = Math.max(max, x / a + x % a);
            System.out.println(max);
        }
    }
}
