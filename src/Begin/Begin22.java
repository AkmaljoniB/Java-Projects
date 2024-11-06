package Begin;

import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.printf("a = ");
        a = scanner.nextDouble();
        System.out.printf("b = ");
        b = scanner.nextDouble();
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
