package Alexeev;

import java.util.Scanner;

public class Alexeev_0697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int s = 2 * (h * l + h * w);
        if (s % 16 == 0) {
            System.out.println(s / 16);
        } else {
            System.out.println((s / 16) + 1);
        }
    }
}
