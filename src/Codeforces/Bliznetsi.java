package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Bliznetsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        long s = 0;
        long z = 0;
        int v = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                s = s + arr[j];
            }
            v = v + arr[i];
            if (v > s) {
                z = i;
                break;
            }
            s = 0;

        }
        System.out.println(arr.length - z);
    }
}
