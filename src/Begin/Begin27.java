package Begin;

import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a=");
        double a = scanner.nextDouble();
        System.out.println("A daraja 2=" + Math.pow(a, 2));
        System.out.println("A daraja 4=" + Math.pow(a, 4));
        System.out.println("A daraja 8=" + Math.pow(a, 8));
    }
}
