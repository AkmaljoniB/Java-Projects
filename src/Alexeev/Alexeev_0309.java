package Alexeev;

import java.util.Scanner;

public class Alexeev_0309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k =0;
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            sb.reverse();
            if (Integer.parseInt(String.valueOf(sb))+i==n)k++;
        }
        System.out.println(k);
    }
}
