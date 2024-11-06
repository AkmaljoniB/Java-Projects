package Alexeev;

import java.util.Scanner;

public class Alexeev_0276 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < m - (n % m); i++) System.out.print((n / m) + " ");
        for (int i = 0; i < n % m; i++) System.out.print((n / m + 1)+" ");
    }
}
