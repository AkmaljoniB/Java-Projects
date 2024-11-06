package Begin;

import java.util.Scanner;

public class Begin20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,x1,x2,y1,y2 ;
        System.out.println("x1 = ");
        x1 = scanner.nextDouble();
        System.out.println("x2 = ");
        x2 = scanner.nextDouble();
        System.out.println("y1 = ");
        y1 = scanner.nextDouble();
        System.out.println("y2 = ");
        y2 = scanner.nextDouble();
        a = Math.sqrt(Math.pow(x2-x1,2))+Math.pow(y2-y1,2);
        System.out.println("a = "+a);
    }
}
