package For;

import java.util.Scanner;

public class For_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double n = scanner.nextDouble();
        double s = 0 ;
       for (double i = 0; i <= n; i++){
           s += Math.pow(a,i);
       }
            System.out.println(s);
    }
}
