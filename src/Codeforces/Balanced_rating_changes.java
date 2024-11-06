package Codeforces;

import java.util.Scanner;

public class Balanced_rating_changes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0, l = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a % 2 == 0) System.out.println(a / 2);
            else {
                if (a < 0) {
                    if (k == 0) System.out.println(a / 2);
                    else System.out.println(a / 2 + a % 2);
                    k^=1;
                }
                if (a > 0) {
                    if (l == 0) System.out.println(a / 2);
                    else System.out.println(a / 2 + a % 2);
                    l^=1;
                }
            }
        }
    }
}
