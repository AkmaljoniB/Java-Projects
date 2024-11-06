package Codeforces;

import java.util.Scanner;

public class Kvadrati_i_kubi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t --> 0) {
            int n = scanner.nextInt();
            System.out.println((int) Math.sqrt(n) + (int) Math.cbrt(n) - (int) (Math.sqrt(Math.cbrt(n))));
        }
    }
}