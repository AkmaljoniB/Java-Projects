package Alexeev;

import java.util.Scanner;

public class Alexeev_0068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = scanner.nextLine();
        int a = Integer.parseInt(s1);
        if (s.equals("Home") || (s.equals("School") && a % 2 != 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}