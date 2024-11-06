package If;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && b == c) System.out.println(0);
        else if (b == c) System.out.println(1);
        else if (a != b && a == c) System.out.println(2);
        if (a == b && b != c) System.out.println(3);

    }
}
