package Codeforces;

import java.util.Scanner;

public class Shastlivoe_delenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        if (a / 10 % 10 == 7 && a % 10 == 4 || a / 10 % 10 == 4 && a % 10 == 7 && a < 100) {
            System.out.println("YES");
        } else if (a % 4 == 0 || a % 7 == 0 && a < 100) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}