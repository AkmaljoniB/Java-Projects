package Codeforces;

import java.util.Scanner;

public class Krasiviy_god {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b, c, d, e, f = 0;
        for (int i = a+1; i < 9012; i++) {
            b = i % 10;
            c = i / 10 % 10;
            d = i / 100 % 10;
            e = i / 1000 % 10;
            if (b != c && b != d && b != e && c != d && c != e && d != e) {
                f = i;
                break;
            }
        }
        System.out.println(f);
    }
}