package Codeforces;

import java.util.Scanner;

public class Transport_na_noviy_god {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int j=1;
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (j = 1; j < t; j = j + arr[j]) {
        }
        if (j == t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
