package Codeforces;

import java.util.Scanner;

public class Nomer_etazha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            if (n <= 2) {
                System.out.println(1);
            } else if ((n - 2) % x == 0) {
                System.out.println((n - 2) / x + 1);
            } else {
                System.out.println((n - 2) / x + 2);
            }
        }
    }
}