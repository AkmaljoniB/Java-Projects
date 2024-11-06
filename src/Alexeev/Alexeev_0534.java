package Alexeev;

import java.util.Scanner;

public class Alexeev_0534 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            arr[scanner.nextInt() - 1]--;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]<0) System.out.println("yes");
            else System.out.println("no");
        }
    }
}