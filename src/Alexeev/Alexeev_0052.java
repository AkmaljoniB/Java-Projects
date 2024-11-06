package Alexeev;

import java.util.Scanner;

public class Alexeev_0052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b, c, d, e, f, g, h, i;
        b = a / 100000 % 10;
        c = a / 10000 % 10;
        d = a / 1000 % 10;
        e = a / 100 % 10;
        f = a / 10 % 10;
        g = a % 10;
        h = b + c + d;
        i = e + f + g;
        if (h == i) {
            System.out.println("YES");
        }
        if (h != i){
            System.out.println("NO");
        }
    }
}