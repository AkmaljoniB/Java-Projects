package Codeforces;

import java.util.Scanner;

public class Amr_and_pins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int xi = scanner.nextInt();
        int yi = scanner.nextInt();
        System.out.println((int)Math.ceil(Math.sqrt(Math.pow(xi-x,2)+Math.pow(yi-y,2))/(r*2)));
    }
}
