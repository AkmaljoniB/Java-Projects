package Begin;

import java.util.Scanner;

public class Begin37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double V1, S, V2, T, s, Sy;
        System.out.println("V1 = ");
        V1 = scanner.nextDouble();
        System.out.println("V2 = ");
        V2 = scanner.nextDouble();
        System.out.println("T = ");
        T = scanner.nextDouble();
        System.out.println("S = ");
        S = scanner.nextDouble();
        s = (V1 + V2) * T;
        Sy = s - S;
        System.out.println("s = " + s);
        System.out.println("Sy = " + Sy);
    }
}