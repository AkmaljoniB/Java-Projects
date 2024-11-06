package Begin;

import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Tc, Tf;
        System.out.println("Tf = ");
        Tf =scanner.nextDouble();
        Tc=(Tf-32)*5/9 ;
        System.out.println("Tc = "+Tc);
    }
}
