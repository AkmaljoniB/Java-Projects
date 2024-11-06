package Integer;

import java.util.Scanner;

public class Integer14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, b, c, d;
        System.out.println("A = ");
        A = scanner.nextInt();
        b = A / 100;
        c = A / 10 % 10;
        d = A % 10;
        System.out.println("Natija: "+ ((d * 100)+(b*10)+c));
    }
}
