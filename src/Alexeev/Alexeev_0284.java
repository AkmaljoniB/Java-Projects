package Alexeev;

import java.util.Scanner;

public class Alexeev_0284 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        for (int k = 0; k < m; k++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            for (int s =i-1;s<=j-1;s++){
                System.out.print(a[s] +" ");
            }
            System.out.println();
        }
    }
}