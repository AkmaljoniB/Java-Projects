package Codeforces;

import java.util.Scanner;

public class Bright_beautiful_brilliant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print("1 ");
                for (int j = 2; j < i; j++) System.out.print("0 ");
                if (i > 1) System.out.print(1);
                System.out.println();
            }
        }
    }
}