package Alexeev;

import java.util.Scanner;

public class Alexeev_0539 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n%2==0?n/2:n==1?0:n);
    }
}