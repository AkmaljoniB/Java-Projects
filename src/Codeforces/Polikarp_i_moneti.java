package Codeforces;

import java.util.Scanner;

public class Polikarp_i_moneti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a % 3 == 0) {
                System.out.println(a / 3);
                System.out.println(a / 3);
            } else {
                if (a % 3 == 2) {
                    System.out.println(a / 3);
                    System.out.println((a - a / 3) / 2);
                } else {
                    System.out.println(a / 3 + a % 3);
                    System.out.println(a / 3);
                }
            }
        }
    }
}
