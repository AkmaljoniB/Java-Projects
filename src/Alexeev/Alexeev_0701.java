package Alexeev;

import java.util.Scanner;

public class Alexeev_0701 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() % 10 + 2;
        System.out.println(Integer.parseInt(sc.next(),n));
    }
}
