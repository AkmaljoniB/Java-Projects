package Alexeev;

import java.util.Scanner;

public class Alexeev_0554 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = 2;
        for (int i = 2; i <= a; i++) {
            n = n + i;
        }
        System.out.println(n);
//        System.out.println((a + 1) * a / 2 + 1);
    }
}