package Integer;

import java.util.Scanner;

public class Integer18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A;
        System.out.println("A = ");
        A = scanner.nextInt();
        System.out.println("Natija: " + (A / 1000 % 10));
    }
}
