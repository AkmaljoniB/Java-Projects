package For;

import java.util.Scanner;

public class For_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double n = scanner.nextDouble();
        double d = 1;
        double rez = 1;

        for (int i = 1; i <= n; i++) {
            d = d * x;
            rez = rez + d / 3;
        }
        System.out.println(rez);
    }
}
