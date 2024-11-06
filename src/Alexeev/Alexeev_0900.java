package Alexeev;

import java.util.Scanner;

public class Alexeev_0900 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a/3;
        int c = a/3;
        int d = a/3;
        b = b/2;
        c = c/2;
        d = d+2*(a/3/2);
        b = b/2;
        c = c+(2*b);
        d = d-b;
        b = b+(c/2)+(d/2);
        c = c/2;
        d = d/2;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}