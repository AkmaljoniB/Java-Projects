package Codeforces;

import java.util.Scanner;

public class Ksyusha_i_kolsevaya_doroga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        long k = arr[0]-1;
        for (int i = 1; i < m; i++) {
            if (arr[i] > arr[i - 1]) {
                k += arr[i] - arr[i - 1];
            } else if (arr[i] < arr[i - 1]) {
                k += arr[i] + n - arr[i - 1];
            }
        }
        System.out.println(k);
    }
}