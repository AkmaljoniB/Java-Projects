package Begin;

import java.util.Scanner;

public class Begin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        double S, P ;
        System.out.print(" a = ");
        double a = scanner.nextDouble() ;
        System.out.print(" b = ");
        double b = scanner.nextDouble() ;
        S = a *b ;
        System.out.println("S = "+S);
        P = 2*(a +b) ;
        System.out.println("P = "+P);
    }
}
