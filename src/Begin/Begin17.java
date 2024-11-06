package Begin;

import java.util.Scanner;

public class Begin17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A, B, C, ac, bc;
        System.out.println("A = ");
        A = scanner.nextDouble();
        System.out.println("B = ");
        B = scanner.nextDouble();
        System.out.println("C = ");
        C = scanner.nextDouble();
        ac = Math.abs(A - C);
        bc = Math.abs(B - C);
        System.out.println("Symma = " + (ac + bc));
        System.out.println("ac = " + ac);
        System.out.println("bc = " + bc);
    }
}
