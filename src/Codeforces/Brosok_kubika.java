package Codeforces;

import java.util.Scanner;

public class Brosok_kubika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int v = scanner.nextInt();
        int max = Math.max(y, v);
        max = (6 - max) + 1;
        if (max == 6) {
            System.out.println("1/1");
        } else if (max == 5) {
            System.out.println("5/6");
        } else if (max == 4) {
            System.out.println("2/3");
        } else if (max == 3) {
            System.out.println("1/2");
        } else if (max == 2) {
            System.out.println("1/3");
        } else if (max == 1) {
            System.out.println("1/6");
        } else {
            System.out.println("0/1");
        }
    }
}