package Alexeev;

import java.util.Scanner;

public class Alexeev_0296 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        while ((n - k) % 5 != 0) k += 3;
        System.out.println(((n - k) / 5) + " " + (k / 3));
    }
}
