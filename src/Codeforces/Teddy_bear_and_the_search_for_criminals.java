package Codeforces;

import java.util.Scanner;

public class Teddy_bear_and_the_search_for_criminals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int[] arr = new int[n];
        int k = 0, max = Math.max(0, a - (n - a)-1);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (i < max) k += arr[i];
        }
        for (int i = max; i < n; i++) {
            int b = a + (a - i) - 2;
            if (b == i) {
                k += arr[i];
                break;
            }
            if (arr[i] > 0 && arr[b] > 0) k += arr[i] + arr[b];
        }
        for (int i = a + a - 1; i < n; i++) if (arr[i] > 0) k += arr[i];
        System.out.println(k);
    }
}