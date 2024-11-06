package Codeforces;

import java.util.Scanner;

public class Arbuz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if (w % 2 == 1 || w < 4) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}