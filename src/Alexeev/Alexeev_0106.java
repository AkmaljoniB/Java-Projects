package Alexeev;

import java.util.Scanner;

public class Alexeev_0106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int s, p = 0, d = 0;
        for (int i = 0; i < a; i++) {
            s = scanner.nextInt();
            if (s == 1) {
                p++;
            } else if (s == 0) {
                d++;
            }
        }
        if (p < d) {
            System.out.println(p);
        } else if (p > d){
            System.out.println(d);
        }
    }
}