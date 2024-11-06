package Alexeev;

import java.util.Scanner;

public class Alexeev_0947 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        double x = Double.parseDouble(st);
        int k = 1;
        double s = 0;
        while (s < x) {
            k++;
            s += (double) 1 / k;
        }
        System.out.println((k - 1)+" card(s)");
    }
}
