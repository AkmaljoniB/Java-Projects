package Codeforces;

import java.util.Scanner;

public class Kamennaya_igra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int A[] = new int[n];
            int max = 0, min = 0;
            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
                if (A[i] > A[max]) max = i;
                if (A[i] < A[min]) min = i;
            }
            int m1 = Math.min(max,min);
            int m2 = Math.max(max,min);
            System.out.println(Math.min(Math.min(n - m1, m2 + 1), m1 + 1 + n - m2));
        }
    }
}