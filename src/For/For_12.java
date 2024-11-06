package For;

import java.util.Scanner;

public class For_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();
        double a = 1 ;
        double p = 1 ;
        for (double i=0.1; i<=N/10; i=i+0.1) {
        a*= p+i ;
        }
        System.out.println(a);
    }
}