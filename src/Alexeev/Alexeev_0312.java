package Alexeev;

import java.util.Scanner;

public class Alexeev_0312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(((n-1)*(a2-a1))+a1);
    }
}
