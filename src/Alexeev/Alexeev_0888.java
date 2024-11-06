package Alexeev;

import java.util.Scanner;

public class Alexeev_0888 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long l = 0;
        int k = 3;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a == 1) {
                l += k;
                k++;
            } else k=Math.max(3,k-3);
        }
        System.out.println(l);
    }
}