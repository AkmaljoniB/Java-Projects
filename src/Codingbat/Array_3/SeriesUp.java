package Codingbat.Array_3;

import java.util.Arrays;

public class SeriesUp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(4)));
    }

    public static int[] seriesUp(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                a++;
            }
        }
        int[] arr = new int[a];
        int s = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                arr[i + j - s] = j;
            }
            if (i >= 2) {
                for (int d = 0; d < i - 1; d++) {
                    s--;
                }
            }
        }
        return arr;
    }
}