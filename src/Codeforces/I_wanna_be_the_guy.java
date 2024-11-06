package Codeforces;

import java.util.Scanner;

public class I_wanna_be_the_guy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] arr = new int[x];
        int k = 0;
        for (int i = 0; i < x; i++) {
            arr[i] = scanner.nextInt();
        }
        int y = scanner.nextInt();
        int[] arr1 = new int[x+y];
        for (int i = 0; i < x; i++) {
            arr1[i] = arr[i];
        }
        for (int i = x; i < y+x; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j]==i) {
                    k++;
                    break;
                }
            }
        }
        if (k == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}