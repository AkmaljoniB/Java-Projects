package Codeforces;

import java.util.Scanner;

public class K_noc_simple_version {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if (n % 2 != 0) System.out.println("1 " + (n / 2) + " " + (n / 2));
            else {
                if (n / 2 % 2 == 0) System.out.println((n / 2) + " " + (n / 4) + " " + (n / 4));
                else System.out.println("2 " + ((n - 2) / 2) + " " + ((n - 2) / 2));
            }
        }
    }
}
