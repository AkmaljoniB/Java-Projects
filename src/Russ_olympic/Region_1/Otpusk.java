package Russ_olympic.Region_1;

import java.util.Scanner;

public class Otpusk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int c;
        if (d != 1) {
            c = a - 8 + d;
        } else {
            c=a;
        }
        System.out.println(c/7);
    }
}