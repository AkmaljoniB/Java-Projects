package Codeforces;

import java.util.Scanner;

public class Magnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1] ) {
                k++;
            }
        }
        System.out.println(k);
    }
}
