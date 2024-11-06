package Codeforces;

import java.util.Scanner;

public class Dva_lifta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a < Math.abs(c-b)+c) {
                System.out.println(1);
            } else if (a > Math.abs(c-b)+c) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
            t--;
        }
    }
}