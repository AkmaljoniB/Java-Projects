package Alexeev;

import java.util.Scanner;

public class Alexeev_0154 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = 0, d = 0;
        for (int i = 10; i > 0; i--) {
            if (Math.pow(i, 3)+f < n) {
                d++;
                for (int i1 = 0; i1 < n; i1++) {
                    if (n - (Math.pow(i, 3) + f) >= Math.pow(i, 3)) {
                        d++;
                        f += Math.pow(i, 3);
                        if (d == 8) {
                            System.out.println("Impossible");
                            break;
                        }
                    } else {
                        break;
                    }
                }
                f += Math.pow(i, 3);
            }
            if (f == n) {
                break;
            }
        }
        f=0;
        if (d < 8) {
            for (int i = n; i > 0; i--) {
                if (Math.pow(i, 3) < n) {
                    System.out.println(i);
                    for (int i1 = 0; i1 < n; i1++) {
                        if (n - (Math.pow(i, 3) + f) >= Math.pow(i, 3)) {
                            System.out.println(i);
                            f += Math.pow(i, 3);
                        } else {
                            break;
                        }
                    }
                    f += Math.pow(i, 3);
                }
                if (f == n) {
                    break;
                }
            }
        }
    }
}