package For;

import java.util.Scanner;

public class For_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();
        double s = 0;
        for (double i = 1; i <= N; i++) {
            s = s + 1 / i;
        }
        System.out.println(s);
    }
}
