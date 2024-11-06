package Begin;

import java.util.Scanner;

public class Begin6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, V, S ;
        System.out.println("a = ");
        a = scanner.nextDouble();
        System.out.println("b = ");
        b = scanner.nextDouble();
        System.out.println("c = ");
        c = scanner.nextDouble();
        V = a*b*c ;
        System.out.println("V = "+V);
        S = 2* (a*b+b*c+a*c) ;
        System.out.printf("S = %.2f ",S);
    }
}
