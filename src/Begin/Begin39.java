package Begin;

import java.util.Scanner;

public class Begin39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d,x1,x2 ;
        System.out.println("a = ");
        a = scanner.nextDouble();
        System.out.println("b = ");
        b = scanner.nextDouble();
        System.out.println("c = ");
        c = scanner.nextDouble();
        d = Math.pow(b,2)-4*a*c ;
        x1 = (-b - Math.sqrt(d))/(2*a);
        x2 = (-b + Math.sqrt(d))/(2*a);
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }
}
