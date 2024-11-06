package Massive;

import java.util.Random;
import java.util.Scanner;

public class Cumm_raqamhoi_elementi_massive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0, p = 0, o = 0, g = 0, d = 0;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > 9) {
                s = arr[i] / 10;
                p = arr[i] % 10;
                o += s + p;
            }
            if (arr[i] < 10) {
                g += arr[i];
            }
            d = o + g;
        }
        System.out.println(d);
    }
}
