package Alexeev;

import java.util.Scanner;

public class Alexeev_0685 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int b3 = scanner.nextInt();

        int maxa = Math.max(a1, Math.max(a2, a3));
        int maxb = Math.max(b1, Math.max(b2, b3));

        int mina = Math.min(a1, Math.min(a2, a3));
        int minb = Math.min(b1, Math.min(b2, b3));

        int middlea = a1 + a2 + a3 - (maxa + mina);
        int middleb = b1 + b2 + b3 - (maxb + minb);

        int s;
        s = maxa * maxb + mina * minb + middlea * middleb;
        System.out.println(s);
    }
}
