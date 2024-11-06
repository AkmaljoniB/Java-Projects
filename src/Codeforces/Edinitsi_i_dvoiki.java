package Codeforces;

import java.util.Scanner;

public class Edinitsi_i_dvoiki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] array = new int[t];
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            int d = 0;
            for (int j = 1; j < n; j++) {
                int a = 1, b = 1;
                for (int k = 0; k < j; k++) {
                    a *= arr[k];
                }
                for (int k = j; k < n; k++) {
                    b *= arr[k];
                }
                if (a == b) {
                    array[i] = j;
                    d++;
                    break;
                }
            }
            if (d == 0) {
                array[i] = -1;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(array[i]);
        }
    }
}