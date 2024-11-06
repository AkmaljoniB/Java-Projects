package Codeforces;

import java.util.Scanner;

public class Maximizing_the_median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t = sc.nextInt(); t-- > 0; ) {
            int n = sc.nextInt(), s = sc.nextInt();
            System.out.println(s / (n - (n / 2 + n % 2) + 1));
        }
    }
}
