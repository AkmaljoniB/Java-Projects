package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Chestniy_trener {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] - arr[i] < min) {
                    min = arr[i + 1] - arr[i];
                }
            }
            System.out.println(min);
        }
    }
}