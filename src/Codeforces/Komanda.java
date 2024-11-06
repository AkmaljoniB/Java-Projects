package Codeforces;

import java.util.Scanner;

public class Komanda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int s, c = 0;
        for (int i = 0; i < a; i++) {
            int b = 0;
            for (int i1 = 1; i1 < 4; i1++) {
                s = scanner.nextInt();
                if (s == 1) {
                    b++;
                    if (b == 2) {
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
    }
}