package Begin;

import java.util.Scanner;

public class Begin9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, C ;
        System.out.println("a = ");
        a = scanner.nextDouble();
        System.out.println("b =  ");
        b = scanner.nextDouble();
        C = Math.sqrt (a*b) ;
        System.out.println("C = "+C);
    }
}