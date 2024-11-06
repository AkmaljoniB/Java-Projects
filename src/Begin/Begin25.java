package Begin;

import java.util.Scanner;

public class Begin25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        double x = scanner.nextDouble();
        double y = 3*(Math.pow(x,6))-6*Math.pow(x,2)-7;
        System.out.print("y = "+y);
    }
}
