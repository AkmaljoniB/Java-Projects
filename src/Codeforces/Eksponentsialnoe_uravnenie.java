package Codeforces;

import java.util.Scanner;

public class Eksponentsialnoe_uravnenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0 ; i<t;i++) {
            int n = scanner.nextInt();
            if (n/2+n/2==n) {
                System.out.println(1);
                System.out.println(n / 2);
            } else {
                System.out.println(-1);
            }
        }
    }
}