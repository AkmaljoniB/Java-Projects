package Codeforces;

import java.util.Scanner;

public class Levko_and_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = 1, r = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == l && r == j) {
                    System.out.print(k + " ");
                    l++;
                    r--;
                } else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
