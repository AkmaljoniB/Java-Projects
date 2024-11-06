package Alexeev;

import java.util.Scanner;

public class Alexeev_0022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b, c = 0;
//        String temp = "";
//        while (a != 0) {
//            b = a % 2;
//            temp = b + temp;
//            a = a / 2;
//            if (b == 1) {
//                c++;
//            }
//        }
//        System.out.println(c);
        int n = scanner.nextInt();
        int s = 0;
        while (n > 0) {
            s = s + n % 2;
            n = n / 2;
        }
        System.out.println(s);
    }
}
