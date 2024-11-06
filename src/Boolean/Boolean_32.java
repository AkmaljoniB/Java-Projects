package Boolean;

import java.util.Scanner;

public class Boolean_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        boolean f = false;
        boolean t = true;
        if (Math.pow(a,2) == (Math.pow(b,2)+Math.pow(c,2)) || Math.pow(b,2) == (Math.pow(a,2)+Math.pow(c,2)) || Math.pow(c,2)==(Math.pow(a,2)+Math.pow(b,2)) && a>0 && b>0 && c>0){
            System.out.println(t);
        } else {
            System.out.println(f);
        }
    }
}
