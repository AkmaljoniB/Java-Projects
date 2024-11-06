package Begin;

import java.util.Scanner;

public class Begin21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, nimP, P, S;
        System.out.println("x1 =");
        double x1 = scanner.nextDouble();
        System.out.println("y1 =");
        double y1 = scanner.nextDouble();
        System.out.println("x2 =");
        double x2 = scanner.nextDouble();
        System.out.println("y2 =");
        double y2 = scanner.nextDouble();
        System.out.println("x3 =");
        double x3 = scanner.nextDouble();
        System.out.println("y3 =");
        double y3 = scanner.nextDouble();
        a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        c = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        P = a + b + c;
        nimP = P / 2;
        S = Math.sqrt(nimP * (nimP - a) * (nimP - b) * (nimP - c));
        System.out.printf("P = %.2f", P);
        System.out.println();
        System.out.printf("S = %.2f", S);

    }
}
