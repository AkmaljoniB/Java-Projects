package Alexeev;

import java.util.Scanner;

public class Alexeev_0675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int m =scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            min = Math.min(min,s.replace("A","").replace("B","").length());
        }
        System.out.println(min);
    }
}
