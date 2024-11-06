package Alexeev;

import java.util.Scanner;

public class Alexeev_0834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = Math.PI;
        double xk = sc.nextDouble();
        double yk = sc.nextDouble();
        double xc = sc.nextDouble();
        double yc = sc.nextDouble();
        double r = sc.nextDouble();
        double h = Math.sqrt(Math.pow(xk - xc, 2) + Math.pow(yc - yk, 2));
        if (h <= r) System.out.println(pi * r * r);
        else {
            double a = Math.sqrt(h * h - r * r);
            double st = a * r;
            double alpha = 360 - Math.asin(a / h) * 180 / pi * 2;
            double s = pi * r * r / 360 * alpha;
            String p = String.format("%.3f", s + st).replace(",", ".");
            System.out.println(p);
        }
    }
}