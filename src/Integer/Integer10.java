package Integer;

import java.util.Scanner;

public class Integer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A ;
        System.out.println("A = ");
        A = scanner.nextInt();
        System.out.println("Vohid: "+(A % 10));
        System.out.println("Dahi: " + ((A / 10)%10));

    }
}
