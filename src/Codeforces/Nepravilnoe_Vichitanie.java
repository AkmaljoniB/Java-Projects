package Codeforces;

import java.util.Scanner;

public class Nepravilnoe_Vichitanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            if (n % 10 == 0) {
                n = n / 10;
            } else  {
                n=n - 1;
            }
        }
        System.out.println(n);
    }
}