package For;

import java.util.Scanner;

public class For_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a =scanner.nextDouble();
        for (double i = 1.2; i<2; i=i+0.2) {
            System.out.println(i*a);
        }
    }
}
