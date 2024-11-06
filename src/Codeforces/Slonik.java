package Codeforces;

import java.util.Scanner;

public class Slonik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        if (a % 5 == 0) {
            System.out.println(a/5);
        } else {
            System.out.println(a/5 + 1);
        }
    }
}