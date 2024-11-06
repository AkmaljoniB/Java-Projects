package Codeforces;

import java.util.Scanner;

public class Tramvay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0, p = 0;
        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            s = s + b - a;
            if (s >= p) {
                p = s;
            }
        }
        System.out.println(p);
    }
}