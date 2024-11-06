package Massive;

import java.util.Scanner;

public class Cumma_az_min_to_max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int m = 0;
        int k = 1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                s = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                m = i;
            }
        }
        if (s < m) {
            for (int i1 = s+1; i1 < m; i1++) {
                k += arr[i1];
            }
        } else {
            for (int i2 = m+1 ; i2 < s; i2++) {
                k *= arr[i2];
            }
        }
        System.out.println(m);
        System.out.println(s);
        System.out.println("Cumma az min to max: " + k);
    }
}
