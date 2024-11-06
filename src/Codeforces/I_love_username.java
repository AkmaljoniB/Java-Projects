package Codeforces;

import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int k = 0;
        int min = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (i == 0) {
                min = arr[0];
                max = arr[0];
            }
            if (arr[i] > max) {
                max = arr[i];
                k++;
            } else if (arr[i] < min) {
                min = arr[i];
                k++;
            }
        }
        System.out.println(k);
    }
}