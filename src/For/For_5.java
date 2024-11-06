package For;

import java.util.Scanner;

public class For_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        for (double i = 1; i<=a; i = i + (a/10)) {
            System.out.println(i);
        }
    }
}
