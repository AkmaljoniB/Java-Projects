package Codeforces;

import java.util.Scanner;

public class Taisiya_i_kubiki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.println(s - r);
            while (n - 1 > 0) {
                if (r / 6 >= n - 1 && r >= 6) {
                    System.out.println(6);
                    r -= 6;
                    n--;
                } else if (r / 5 >= n - 1 && r >= 5) {
                    System.out.println(5);
                    r -= 5;
                    n--;
                } else if (r / 4 >= n - 1 && r >= 4) {
                    System.out.println(4);
                    r -= 4;
                    n--;
                } else if (r / 3 >= n - 1 && r >= 3) {
                    System.out.println(3);
                    r -= 3;
                    n--;
                } else if (r / 2 >= n - 1 && r >= 2) {
                    System.out.println(2);
                    r -= 2;
                    n--;
                } else if (r >= n - 1 && r >= 1) {
                    System.out.println(1);
                    r--;
                    n--;
                }
            }
        }
    }
}