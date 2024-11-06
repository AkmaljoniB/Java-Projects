package Codeforces;

import java.util.Scanner;

public class Mishka_i_Starshii_brat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a <= b) {
                a = a * 3;
                b = b * 2;
                c++ ;
            }
        }
        System.out.println(c);
    }
}
