package For;

import java.util.Scanner;

public class For_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 1;
        int d = 0;

        for (int i = 1; i <= n; i++) {
            s *= i;
            d += s;
        }
        System.out.println(d);
    }
}