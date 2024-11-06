package Alexeev;

import java.util.Scanner;

public class Alexeev_0496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        max = arr[0]+arr[n-1]+(Math.max(arr[1], arr[n - 2]));
        for (int i = 0; i < n-2; i++) {
            int p = arr[i]+arr[i+1]+arr[i+2];
            if (max < p) {
                max = p;
            }
        }
        System.out.println(max);
    }
}