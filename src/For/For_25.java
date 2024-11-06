package For;

import java.util.Scanner;

public class For_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        double d=0,pow = 1,p = 0;
        for (int i = 1; i <= n; i++) {
            pow = pow * x;
            p = p + (pow / i);
            pow = pow * (-1);
        }
        System.out.println(p);
//        for (int i = 1; i <= n; i++) {
//            if (p%2==0) {
//                d = d + Math.pow(x, i) / i;
//            } else {
//                d = d - Math.pow(x, i) / i;
//            }
//            p++;
//        }
//        System.out.println(d);
    }
}