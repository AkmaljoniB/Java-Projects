package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Interesniy_napitok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int q = scanner.nextInt();
        int s = 0, k = 0;
        for (int i = 0; i < q; i++) {
            int m = scanner.nextInt();
            if (i == 0) {
                s = m;
                k = i;
            }
            if (m >= arr[n - 1]) {
                System.out.println(n);
            } else if (m < arr[0]) {
                System.out.println(0);
            } else if (m >= arr[n / 2]) {
                for (int j = n - 1; j >= 0; j--) {
                    if (m >= arr[j]) {
                        System.out.println(j + 1);
                        break;
                    }
                }
            } else {
                if (s < m) {
                    for (int j = k; j < n; j++) {
                        if (m < arr[j]) {
                            System.out.println(j);
                            break;
                        }
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        if (m < arr[j]) {
                            System.out.println(j);
                            k = j;
                            break;
                        }
                    }
                }
                s = m;
            }
        }
    }
}