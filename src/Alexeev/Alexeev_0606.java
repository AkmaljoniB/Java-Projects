package Alexeev;

import java.util.Scanner;

public class Alexeev_0606 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x+y>z && x+z>y && z+y>x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}