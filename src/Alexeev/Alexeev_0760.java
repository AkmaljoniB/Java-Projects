package Alexeev;

import java.util.Scanner;

public class Alexeev_0760 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        double v = scanner.nextInt();
        double l = scanner.nextInt();
        double s=0;
        for (int i = 0; i <n ; i++) {
            int x =scanner.nextInt();
            int m =scanner.nextInt();
            s+=m;
        }
        String str = String.format("%.2f", (l/v*60+s));
        System.out.println(str.replace(",","."));
    }
}
