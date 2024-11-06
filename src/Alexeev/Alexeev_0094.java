package Alexeev;

import java.util.Scanner;

public class Alexeev_0094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if (n > k || n >= m) {
            int l = 0;
            while (m > 0) {
                if (l != 0) m += k;
                l++;
                m -= n;
            }
            System.out.println(l);
        } else System.out.println("NO");
    }
}
