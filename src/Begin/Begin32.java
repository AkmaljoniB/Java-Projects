package Begin;

import java.util.Scanner;

public class Begin32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Tc, Tf;
        System.out.println("Tf = ");
        Tc =scanner.nextDouble();
        Tf=Tc/5*9+32 ;
        System.out.println("Tf = "+Tf);
    }
}