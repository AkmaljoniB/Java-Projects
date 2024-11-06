package Codeforces;

import java.util.Scanner;

public class Noviy_god_i_speshka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int t = 0;
        int l = 0;
        for (int i = 1; i <= n; i++) {
            l += i * 5;
            if (l <= 240 - k) {
                t++;
            } else {
                break;
            }
        }
        System.out.println(t);
    }
}