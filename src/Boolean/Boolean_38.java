package Boolean;

import java.util.Scanner;

public class Boolean_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println(Math.abs(x2 - y2) == 1 || Math.abs(x2-x1)==Math.abs(y2-y1));
    }
}
