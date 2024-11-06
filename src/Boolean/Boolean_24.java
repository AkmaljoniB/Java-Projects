package Boolean;

import java.util.Scanner;

public class Boolean_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double D;
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        D = Math.pow(b, 2) - (4 * a * c);
        System.out.println(D >= 0 && a!=0);
    }
}