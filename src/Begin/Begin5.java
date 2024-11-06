package Begin;

import java.util.Scanner;

public class Begin5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        double V, S, a ;
        System.out.println("a = ");
        a = scanner.nextDouble() ;
        V = Math.pow(a,3);
        System.out.println("V = "+V);
        S = 6*Math.pow(a,2) ;
        System.out.println("S = "+S);

    }
}
