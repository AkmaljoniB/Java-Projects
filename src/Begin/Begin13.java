package Begin;

import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double S1,S2,S3;
        final double pi =3.14 ;
        System.out.println("R1 = ");
        double R1 = scanner.nextDouble();
        System.out.println("R2 = ");
        double R2 = scanner.nextDouble();
        S1 = pi*Math.pow(R1,2);
        S2 = pi*Math.pow(R2,2);
        S3 = S1-S2 ;
        System.out.println("S1 = "+S1);
        System.out.println("S2 = "+S2);
        System.out.println("S3 = "+S3);
    }
}
