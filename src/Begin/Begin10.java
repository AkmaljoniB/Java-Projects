package Begin;

import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        System.out.println("a = ");
        a = scanner.nextDouble();
        System.out.println("b = ");
        b = scanner.nextDouble();
        System.out.println("Cymma = " + (a + b));
        System.out.println("Tapx = " + (a - b));
        System.out.println("Zarb = " + (a * b));
        System.out.println("Квадрати тақсимашон = " + (Math.pow(a,2)/Math.pow(b,2)));
    }
}
