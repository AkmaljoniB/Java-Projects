package Boolean;

import java.util.Scanner;

public class Boolean_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println(x2==x1 && y2>=1 || y2 == y1 && x2>=1);
    }
}
