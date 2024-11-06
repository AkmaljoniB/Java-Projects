package Codeforces;

import java.util.Scanner;

public class Otkritki_dlya_druzey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int k = 1;
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            int a = scanner.nextInt();
            for (int j = 1; j <= a; j++) {
                if (w % 2 == 0) {
                    w /= 2;
                    k *= 2;
                } else if (h % 2 == 0) {
                    h /= 2;
                    k *= 2;
                } else {
                    break;
                }
            }
            if (k >= a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
