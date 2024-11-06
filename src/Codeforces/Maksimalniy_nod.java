package Codeforces;

import java.util.Scanner;

public class Maksimalniy_nod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            System.out.println(n / 2);
            t--;
        }
    }
}