package Alexeev;

import java.util.Scanner;

public class Alexeev_0542 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m =scanner.nextInt();
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(m));
        sb.reverse();
        System.out.println(Integer.parseInt(String.valueOf(sb),2));
    }
}
