package Begin;

import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double P, a, b, c ;
        System.out.println("a = ");
        a = scanner.nextDouble();
        System.out.println("b = ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        P = a+b+c ;
        System.out.printf("c = %.2f",c);
        System.out.println();
        System.out.printf("P = %.2f",P);
    }
}
