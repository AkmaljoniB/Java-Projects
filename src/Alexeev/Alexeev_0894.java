package Alexeev;

import java.util.Scanner;

public class Alexeev_0894 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        double S2 = Double.parseDouble(s.substring(0, s.indexOf(" ")));
        double r1 = Double.parseDouble(s.substring(s.indexOf(" ")));
        double S1 = (Math.PI * Math.pow(r1, 2)) - S2;
        double w = Math.sqrt(S1 / Math.PI);
        String e = String.format("%.3f", w);
        e = e.replace(",", ".");
        System.out.println(e);
    }
}