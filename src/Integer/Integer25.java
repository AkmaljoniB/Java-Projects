package Integer;

import java.util.Scanner;

public class Integer25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K;
        System.out.println("K = ");
        K = scanner.nextInt();
        System.out.println("Natija: "+ ((K+3)%7));
    }
}
