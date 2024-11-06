package For;

import java.util.Scanner;

public class For_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A;
        int n = scanner.nextInt();
        for (double i = 0; i <= n; i++) {
            A = Math.pow(i, 2);
            System.out.println(A);
        }
    }
}