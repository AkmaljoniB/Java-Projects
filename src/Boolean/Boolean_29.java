package Boolean;

import java.util.Scanner;

public class Boolean_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        double x1 = scanner.nextInt();
        double y1 = scanner.nextInt();
        double x2 = scanner.nextInt();
        double y2 = scanner.nextInt();
        boolean f = false;
        boolean t = true;
        if (x1 < x && x < x2 && y2 < y && y < y1){
            System.out.println(t);
        } else {
            System.out.println(f);
        }
    }
}
