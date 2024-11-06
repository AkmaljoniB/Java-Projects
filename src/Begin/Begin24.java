package Begin;

import java.util.Scanner;

public class Begin24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        System.out.printf("a = ");
        double a = scanner.nextDouble();
        System.out.printf("b = ");
        double b = scanner.nextDouble();
        System.out.printf("c = ");
        double c = scanner.nextDouble();
        x = a;
        a = b;
        b = c;
        c = x;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
