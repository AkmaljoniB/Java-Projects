package Codeforces;

import java.util.Scanner;

public class Lumberjacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] h = new int[n];
        int k = 2;
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
            h[i] = scanner.nextInt();
        }
        for (int i = 1; i < n-1; i++) {
            if (x[i] - h[i] > x[i - 1]) {
                k++;
            } else if (x[i]+h[i]<x[i+1]){
                x[i]+=h[i];
                k++;
            }
        }
        System.out.println(n<=2?n:k);
    }
}
