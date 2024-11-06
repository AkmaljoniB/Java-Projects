package Alexeev;

import java.util.Scanner;

public class Alexeev_0263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        if (i > j) {
            int s = i;
            i = j;
            j = s;
        }
        int min = Math.min((j - i - 1), (n - j + i - 1));
        System.out.println(min);
    }
}