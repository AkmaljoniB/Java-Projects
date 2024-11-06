package For;

import java.util.Scanner;

public class For_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double k = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(k = i * a);
        }
    }
}