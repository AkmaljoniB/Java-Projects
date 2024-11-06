package Alexeev;

import java.util.Scanner;

public class Alexeev_0207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            double c= Math.sqrt(2)/2;
            if (a == 1) y += b;
            else if (a == 3) x += b;
            else if (a == 5) y -= b;
            else if (a == 7) x -= b;
            else if (a == 2) {
                x += b * c;
                y += b * c;
            } else if (a == 4) {
                x += b * c;
                y -= b * c;
            } else if (a == 6) {
                x -= b * c;
                y -= b * c;
            } else if (a == 8) {
                x -= b * c;
                y += b * c;
            }
        }
        String stx = String.format("%.3f", x);
        String sty = String.format("%.3f", y);
        stx = stx.replace(",", ".");
        sty = sty.replace(",", ".");
        System.out.println(stx);
        System.out.println(sty);
    }
}
