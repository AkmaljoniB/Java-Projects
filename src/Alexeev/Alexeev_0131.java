package Alexeev;

import java.util.Scanner;

public class Alexeev_0131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0, l = 0;
        for (int i = 1; i <= n; i++) {
            int v = scanner.nextInt();
            int s = scanner.nextInt();
            if (s == 1 && v > max) {
                max = v;
                l = i;
            }
        }
        if (l==0){
            System.out.println(-1);
        } else {
            System.out.println(l);
        }
    }
}