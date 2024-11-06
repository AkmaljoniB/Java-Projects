package Integer;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, z;
        double t;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        t =(a /c) * (b / c) ;
        System.out.println(t);
        x = t * Math.pow(c,2);
        z = a * b - x ;
        System.out.println(z);
    }
}