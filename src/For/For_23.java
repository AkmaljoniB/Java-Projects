package For;

import java.util.Scanner;

public class For_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        double d = 1;
        double s = 1;
        double p = 0;
        for (int i = -1; i <= n; i = i + 2) {
            for (int j = 1; j <= i + 2; j++) {
                s *= j;
            }
            d++;
            if (d % 2 != 0) {
                p = p - Math.pow(x, i + 2) / s;
            } else {
                p = p + Math.pow(x, i + 2) / s;
            }
            s = 1;
        }
        System.out.println(p);
    }
}
