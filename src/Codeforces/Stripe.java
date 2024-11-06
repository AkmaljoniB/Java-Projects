package Codeforces;

import java.util.Scanner;

public class Stripe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0, k = 0;
        int[] arr = new int[n];
        arr[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + scanner.nextInt();
        }
        for (int i = 0; i < n-1; i++) if (arr[i]==arr[n-1]-arr[i])k++;
        System.out.println(k);
    }
}
