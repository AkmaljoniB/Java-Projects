package Codeforces;

import java.util.Scanner;

public class Play_off {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int s = (int) Math.pow(2, n) - 1;
            System.out.println(s);
        }
    }
}