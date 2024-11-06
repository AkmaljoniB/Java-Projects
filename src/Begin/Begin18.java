package Begin;

import java.util.Scanner;

public class Begin18 {
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
        bc = Math.abs(C - B);
        System.out.println("ac = " + ac);
        System.out.println("bc = " + bc);
        System.out.println("ac * bc = "+ac*bc);
    }
}
