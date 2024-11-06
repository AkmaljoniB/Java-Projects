package Codeforces;

import java.util.Scanner;

public class Standup_comedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int a3 = scanner.nextInt();
            int a4 = scanner.nextInt();
            if (a1 != 0) System.out.println(a1 + 2 * Math.min(a2, a3) + Math.min(Math.abs(a3 - a2) + a4, a1 + 1));
            else System.out.println(Math.min(1,Math.max(a2,Math.max(a3,a4))));
        }
    }
}
