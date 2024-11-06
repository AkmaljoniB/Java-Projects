package Alexeev;

import java.util.Scanner;

public class Alexeev_0044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n =0;
        for (int i = 0; i < s.length() - 4; i++) {
            if (s.substring(i, i + 5).equalsIgnoreCase(">>-->") || s.substring(i, i + 5).equalsIgnoreCase("<--<<")){
                n++;
            }
        }
        System.out.println(n);
    }
}
