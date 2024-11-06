package Codeforces;

import java.util.Scanner;

public class Simple_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        if (n == m && m == 1) System.out.println(1);
        else if (n == 1) System.out.println(2);
        else if (m - n >= n) System.out.println(n + 1);
        else System.out.println(n - 1);
    }
}