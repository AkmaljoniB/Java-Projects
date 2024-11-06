package Codeforces;

import java.util.Scanner;

public class Matchi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n * 2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = 0;
        int s = 2;
        for (int j = 0; j < arr.length; j += 2) {
            for (int i = s; i < arr.length; i += 2) {
                if (arr[j] == arr[i + 1]) {
                    k++;
                }
                if (arr[j + 1] == arr[i]) {
                    k++;
                }
            }
            s += 2;
        }
        System.out.println(k);
    }
}