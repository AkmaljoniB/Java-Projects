package Begin;

import java.util.Scanner;

public class Begin28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a=");
        double a = scanner.nextDouble();
        System.out.println("A daraja 2 =" + Math.pow(a, 2));
        System.out.println("A daraja 3 =" + Math.pow(a, 3));
        System.out.println("A daraja 5 =" + Math.pow(a, 5));
        System.out.println("A daraja 10 =" + Math.pow(a, 10));
        System.out.println("A daraja 15 =" + Math.pow(a, 15));
    }
}


