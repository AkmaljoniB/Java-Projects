package If;

import java.util.Scanner;

public class if14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println("Kimati kalon = " + a);
        }
        if (b > c && b > a) {
            System.out.println("Kimati kalon = " + b);
        }
        if (c > a && c > b) {
            System.out.println("Kimati kalon = " + c);
        }
            if (c < a && c < b) {
                System.out.println("Kimati khurd = " + c);
            }
            if (a < b && a < c) {
                System.out.println("Kimati khurd = " + a);
            }
            if (b < c && b < a) {
                System.out.println("Kimati khurd = " + b);
            }
        }
    }