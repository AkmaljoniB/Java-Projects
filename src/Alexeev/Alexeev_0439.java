package Alexeev;

import java.util.Scanner;

public class Alexeev_0439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double p = scanner.nextInt();
        if (p==0) System.out.println(n);
        else {
            double c = (100 / p) * n / (((100 / p) * n) / (100 / p) + (100 / p - 1));
            String s = String.format("%.9f", c);
            s = s.replace(",", ".");
            System.out.println(s);
        }
    }
}
