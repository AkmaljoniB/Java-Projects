package Begin;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.println("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.println("|a-b|="+(Math.abs(x2-x1)));
    }
}
