package Codeforces;

import java.util.Scanner;

public class Konfeti_i_dve_sestri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a % 2 == 0 && a > 2) {
                System.out.println(a / 2 - 1);
            } else if (a > 2) {
                System.out.println(a / 2);
            } else {
                System.out.println(0);
            }
        }
    }
}