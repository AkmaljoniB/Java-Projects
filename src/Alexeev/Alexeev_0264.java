package Alexeev;

import java.util.Scanner;

public class Alexeev_0264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int a = 0, max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                a++;
            } else {
                if (a > max) {
                    max = a;
                }
                a=0;
            }
        }
        if (a > max) {
            max = a;
        }
        System.out.println(max);
    }
}