package Codeforces;

import java.util.Scanner;

public class Lyubimaya_zadacha_Atilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (s.codePointAt(i) > max) {
                    max = s.codePointAt(i);
                }
            }
            System.out.println(max - 96);
        }
    }
}