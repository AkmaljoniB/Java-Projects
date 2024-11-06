package Alexeev;

import java.util.Scanner;

public class Alexeev_0706 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String s = String.format("%.2f",Math.abs(r*x/(2*r-y)));
        s= s.replace(",",".");
        System.out.println(s);
    }
}
