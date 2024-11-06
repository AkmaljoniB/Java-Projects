package Codeforces;

import java.util.Scanner;

public class Vanya_i_kubiki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 2, l = 1, p = 1;
        while (l <= n) {
            p += k;
            l += p;
            k++;
        }
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(k - 2);
        }
    }
}