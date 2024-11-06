package Codeforces;

import java.util.Scanner;

public class Plus_odin_na_podmnozhestve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int min = Integer.MAX_VALUE, max = 0;
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                max = Math.max(a, max);
                min = Math.min(a, min);
            }
            System.out.println(max-min);
        }
    }
}