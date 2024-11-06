package Alexeev;

import java.util.Scanner;

public class Alexeev_0246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0, b = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int a = scanner.nextInt();
            if (a - 1 != b) k++;
            b = a;
        }
        System.out.println(k);
    }
}
