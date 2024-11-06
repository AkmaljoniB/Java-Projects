package Game;

import java.util.Random;
import java.util.Scanner;

public class Ugadai_Chiclo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int s = random.nextInt(10);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (n == s) {
                System.out.println("Шумо ғолиб баромадед рақам " + s + " мебошад");
                break;
            } else if (n != s) {
                System.out.println("Шумо ғолибиятро аз даст додед аз нав дохил кунед рақам " + s + " буд!");
                n = scanner.nextInt();
                s = random.nextInt(10);
            }
        }
    }
}