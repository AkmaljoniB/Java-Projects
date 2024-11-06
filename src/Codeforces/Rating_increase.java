package Codeforces;

import java.util.Scanner;

public class Rating_increase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String ab = scanner.next();
            int a = 0, b = 0;
            for (int i = 1; i < ab.length(); i++) {
                if (ab.charAt(i) != '0') {
                    a = Integer.parseInt(ab.substring(0, i));
                    b = Integer.parseInt(ab.substring(i ));
                    break;
                }
            }
            System.out.println(a < b ? a + " " + b : -1);
        }
    }
}
