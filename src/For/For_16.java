package For;

import java.util.Scanner;

public class For_16 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double N = scanner.nextDouble();;
        for (double i = 1; i <= N; i++){
            System.out.println(Math.pow(A,i));
        }
    }
}
