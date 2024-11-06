package Begin;

import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double L, S, R ;
        final double pi = 3.14 ;
        System.out.print("L = ");
        L = scanner.nextDouble();
        R = L/(2*pi) ;
        S = pi*Math.pow(R,2);
        System.out.printf("R = %.1f",R);
        System.out.println();
        System.out.printf("S = %.0f",S);
    }
}
