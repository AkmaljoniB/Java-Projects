package For;

import java.util.Scanner;

public class For_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        double d = 0, p =0;
        for (int i = -1; i <= n; i=i+2) {
            if (p % 2 == 0) {
                d = d + Math.pow(x, i+2) / (i+2);
            } else {
                d = d - Math.pow(x, i+2) / (i+2);
            }
            p++;
        }
        System.out.println(d);
    }
}