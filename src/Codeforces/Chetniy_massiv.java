package Codeforces;

import java.util.Scanner;

public class Chetniy_massiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int q=0,w=0;
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int k = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] % 2 == i % 2) {
                    k++;
                } else {
                    if (arr[i] % 2 == 0) {
                        q++;
                    } else {
                        w++;
                    }
                }
            }
            if (k == n) {
                System.out.println(0);
            } else {
                if (q!=w) {
                    System.out.println(-1);
                } else {
                    System.out.println(q);
                }
            }
        }
    }
}