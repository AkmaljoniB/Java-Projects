package Integer;

import java.util.Scanner;

public class Integer27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K;
        System.out.println("K = ");
        K = scanner.nextInt();
        System.out.println("Natija: "+ ((K+5)%7));
    }
}
