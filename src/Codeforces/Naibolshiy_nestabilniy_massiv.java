package Codeforces;

import java.util.Scanner;

public class Naibolshiy_nestabilniy_massiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if (n > 2) {
                System.out.println(m * 2);
            } else if (n == 2) {
                System.out.println(m);
            } else {
                System.out.println(0);
            }
        }
    }
}