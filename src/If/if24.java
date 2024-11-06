package If;

import java.util.Scanner;

public class if24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double f=0 ;
        if (x>0) {
            f = 2 * Math.sin(x);
        }
        if (x<=0) {
            f = 6 - x ;
        }
        System.out.println(f);
    }
}