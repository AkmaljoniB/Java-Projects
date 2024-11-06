package Task;

import java.util.Scanner;

public class Codda_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = 0;
        for (int i = 2; i < a; i++) {
            if (a % i != 0) {
                b++;
            }
        }
        if (a - b == 2) {
            System.out.println("Sodda");
        } else {
            System.out.println("Sodda Nest");
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println("Ba "+i+" Taqsim meshavad");
            }
        }
    }
}
