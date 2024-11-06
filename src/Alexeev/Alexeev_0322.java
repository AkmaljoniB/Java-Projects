package Alexeev;

import java.util.Scanner;

public class Alexeev_0322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = 1, b = 0;
        while (a + b <= s.length()) {
            int c = a + b;
            System.out.print(s.charAt(c-1));
            a += b;
            b = a - b;
        }
    }
}