package Begin;

import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double V,U,T1,T2 ;
        System.out.println("V = ");
        V = scanner.nextDouble();
        System.out.println("U = ");
        U = scanner.nextDouble();
        System.out.println("T1 = ");
        T1 = scanner.nextDouble();
        System.out.println("T2 = ");
        T2 = scanner.nextDouble();
        System.out.println("Масофа = "+(V*T1+(V-U)*T2));
    }
}
