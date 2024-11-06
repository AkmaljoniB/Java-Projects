package If;

import java.util.Scanner;

public class if9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b<a) {
            System.out.println("a = "+b);
        } else {
            System.out.println("a = "+a);
        }
        if (a>b) {
            System.out.println("b = "+a);
        } else {
            System.out.println("b = "+b);
        }

    }
}
