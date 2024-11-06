package Codeforces;

import java.util.Scanner;

public class Minuti_do_novogo_goda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println((((24 - h) * 60) + (60 - m))-60);
        }
    }
}