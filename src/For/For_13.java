package For;

import java.util.Scanner;

public class For_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double k = -1 ;
        double s = 0 ;
        for (double i = 1; i<=n; i++){
            k = k * (- 1) ;
            s = s + k *(1 + 0.1 * i);
        }
        System.out.printf("s = %.2f",s);
    }
}
