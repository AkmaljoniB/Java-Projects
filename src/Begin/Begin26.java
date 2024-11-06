package Begin;

import java.util.Scanner;

public class Begin26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y ;
        System.out.printf("x = ");
        double x = scanner.nextDouble();
        y = 4*Math.pow(x-3,6)-7*Math.pow(x-3,3)+2 ;
        System.out.printf("y = "+y);
    }
}
