package Codeforces;

import java.util.Scanner;

public class Pribavit_nechetnoe_ili_vichest_chetnoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a > b) {
                if ((a - b) % 2 != 0) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            } else if (b > a) {
                if ((b - a) % 2 != 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                System.out.println(0);
            }
        }
    }
}