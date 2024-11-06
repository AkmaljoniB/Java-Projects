package Codeforces;

import java.util.Scanner;

public class Eshyo_odna_zadacha_o_dvux_chislax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        for (int i = 0 ; i < t;i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            if ((max - min) % 10 == 0) {
                System.out.println((max - min) / 10);
            } else {
                System.out.println((max - min) / 10+1);
            }
        }
    }
}