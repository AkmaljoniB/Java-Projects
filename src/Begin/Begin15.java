package Begin;

import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double L,D,S;
        final double pi=3.14 ;
        System.out.println("D = ");
        D = scanner.nextDouble();
        L = pi*D ;
        S = pi*Math.pow(D,2)/4 ;
        System.out.printf("L = %.1f",L);
        System.out.println();
        System.out.println("S = "+S);
    }
}
