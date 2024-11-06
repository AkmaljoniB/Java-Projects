package Begin;

import java.util.Scanner;

public class Begin7 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in) ;
        double L, S, R ;
        final double pi = 3.14;
        System.out.println("R = ");
        R = scanner.nextDouble();
        L = 2* pi* R ;
        S = pi * Math.pow(R,2) ;
        System.out.println("L = "+L);
        System.out.println("S = "+S);
    }
}
