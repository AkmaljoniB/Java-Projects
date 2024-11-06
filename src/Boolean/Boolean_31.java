package Boolean;

import java.util.Scanner;

public class Boolean_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        boolean f = false;
        boolean t = true;
        if (a==b || b==c || c==a){
            System.out.println(t);
        } else {
            System.out.println(f);
        }
    }
}
