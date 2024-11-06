package Begin;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, s, p;
        System.out.println("x1=");
        double x1 = scanner.nextDouble();
        System.out.println("y1=");
        double y1 = scanner.nextDouble();
        System.out.println("x2=");
        double x2 = scanner.nextDouble();
        System.out.println("y2=");
        double y2 = scanner.nextDouble();
        a = Math.abs(x2 - x1);
        b = Math.abs(y2 - y1);
        p = 2 * (a + b);
        s = a * b;
        System.out.println("p=" + p);
        System.out.println("s=" + s);
    }
}
