package Boolean;

import java.util.Scanner;

public class Boolean_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        boolean t = true, f = false;
        if (((x1 + y1) % 2) == ((x2 + y2) % 2)) {
            System.out.println(t);
        } else {
            System.out.println(f);
        }
    }
}
