package For;

import java.util.Scanner;

public class For_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double s = 1 ;
        double d = 1 ;
            d = d+1/s ;
            for (int i = 1; i<=n; i++){
                s *= i ;
        }
        System.out.println(d);
    }
}
