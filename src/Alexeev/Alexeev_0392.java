package Alexeev;

import java.util.Scanner;

public class Alexeev_0392 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        arr[0] = scanner.nextInt();
        int min = arr[0];
        int l = 0;
        for (int i = 1; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (min > arr[i]) {
                min = arr[i];
                l = i;
            }
        }
        for (int i = l; i < n; i++) System.out.print(arr[i] + " ");
        for (int i = 0; i < l; i++) System.out.print(arr[i] + " ");

    }
}
