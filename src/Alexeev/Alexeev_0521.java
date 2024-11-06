package Alexeev;

import java.util.Scanner;

public class Alexeev_0521 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int s = 0, t;
        for (int i = p; i <= k; i++) {
            t = i;
            while (t != 2) {
                if (t % 2 != 0) {
                    t = t * 3 + 1;
                } else {
                    t = t / 2;
                }
                s++;
            }
        }
        System.out.println(s);
    }
}
