package Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Max_min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Razmer Massive: ");
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != max && arr[i] != min) {
                System.out.print("["+arr[i]+"]  ");
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
