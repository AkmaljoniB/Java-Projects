package Boolean;

import java.util.Scanner;

public class Boolean_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        boolean t = true ;
        boolean f = false ;
        if (a == b && b==c && a==c){
            System.out.println(t);
        } else {
            System.out.println(f);
        }
    }
}
