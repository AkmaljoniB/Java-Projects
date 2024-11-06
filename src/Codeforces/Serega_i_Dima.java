package Codeforces;

import java.util.Scanner;

public class Serega_i_Dima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        int s = 0, d = 0, l = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (s + d == sum) {
                break;
            } else {
                max = Math.max(arr[i], arr[n - 1 - l]);
                if (max == arr[i] && (i + l) % 2 == 0) {
                    s += arr[i];
                } else if ((i + l) % 2 != 0 && max == arr[i]) {
                    d += arr[i];
                } else if (max == arr[n - 1 - l] && (i + l) % 2 == 0) {
                    s += arr[n - 1 - l];
                    l++;
                    i--;
                } else if ((i + l) % 2 != 0 && max == arr[n - 1 - l]) {
                    d += arr[n - 1 - l];
                    l++;
                    i--;
                }
            }
        }
        System.out.println(s);
        System.out.println(d);
    }
}