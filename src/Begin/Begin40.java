package Begin;

import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a1, a2, b1, b2, c1, c2, x, y, D ;
        System.out.println("a1 = ");
        a1 = scanner.nextDouble();
        System.out.println("a2 = ");
        a2 = scanner.nextDouble();
        System.out.println("b1 = ");
        b1 = scanner.nextDouble();
        System.out.println("b2 = ");
        b2 = scanner.nextDouble();
        System.out.println("c1 = ");
        c1 = scanner.nextDouble();
        System.out.println("c2 = ");
        c2 = scanner.nextDouble();
        D = a1*b2-a2*b1 ;
        x = (c1 * b2 - c2 * b1)/D;
        y = (a1 * c2 - a2 * c1)/D;
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }
}
