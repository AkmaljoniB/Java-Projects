package Begin;

import java.util.Scanner;

public class Begin29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        final double pi = 3.14;
        System.out.println("a = ");
        a = scanner.nextDouble();
        System.out.println("градиус = " + ((pi * a) / 180));
    }
}
