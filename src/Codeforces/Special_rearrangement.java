package Codeforces;

import java.util.Scanner;

public class Special_rearrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if ((a <=n/2 && b>n/2)  ||(a==n/2+1 && b==n/2)) {
                for (int i = n; i > n / 2; i--) {
                    if (i != a && i != b) System.out.print(i + " ");
                }
                System.out.print(a + " " + b + " ");
                for (int i = 1; i <= n / 2; i++) {
                    if (i != a && i != b) System.out.print(i + " ");
                }
                System.out.println();
            } else System.out.println(-1);
        }
    }
}
