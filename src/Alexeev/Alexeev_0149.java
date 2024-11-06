package Alexeev;

import java.util.Scanner;

public class Alexeev_0149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        n = n - 1;
        for (int i = n; i >= 0; i--) {
            arr1[n - i] = arr[i];
            System.out.print(arr[i] + " ");
        }
    }
}