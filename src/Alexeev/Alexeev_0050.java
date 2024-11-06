package Alexeev;

import java.util.Scanner;

public class Alexeev_0050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int p = 0;

        for (int i = 0; i <= a.length() - b.length(); i++) {
            if (a.substring(i, i + b.length()).equals(b)) {
                p++;
                i = i + b.length() - 1;
            }
        }
        System.out.println(p * 2);
    }
}
