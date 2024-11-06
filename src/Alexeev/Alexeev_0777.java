package Alexeev;

import java.util.Scanner;

public class Alexeev_0777 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        if (t < s && s >= 1 && s <= 12 && t >= 1 && t <= 12) {
            System.out.println(t + 12 - s);
        } else {
            System.out.println(t - s);
        }
    }
}
