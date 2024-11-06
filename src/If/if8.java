package If;

import java.util.Scanner;

public class if8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a>b) {
            System.out.println("adadi kalon = "+a);
        } else {
            System.out.println("adadi kalon = "+b);
        }
        if (b<a) {
            System.out.println("adadi hurd = "+b);
        } else {
            System.out.println("adadi hurd = "+a);
        }
    }
}
