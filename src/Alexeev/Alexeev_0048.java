package Alexeev;

import java.util.Scanner;

public class Alexeev_0048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == '0') k++;
            else break;
        }
        System.out.print(1);
        for (int i = 0; i < k; i++) System.out.print("0");
    }
}