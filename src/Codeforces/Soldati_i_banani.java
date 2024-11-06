package Codeforces;

import java.util.Scanner;

public class Soldati_i_banani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int s = 0;
        for (int i = 0; i <= w; i++) {
            s += i * k;
        }
        if (s > n) {
            System.out.println(s - n);
        } else {
            System.out.println(0);
        }
    }
}