package Alexeev;

import java.util.Scanner;

public class Alexeev_0794 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int r, w;
        r = m / k;
        w = Math.min(k-1,m);
        System.out.println((r+w)*n);
    }
}