package Alexeev;

import java.util.Scanner;

public class Alexeev_0028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 =scanner.nextInt();
        int y1 =scanner.nextInt();
        int x2 =scanner.nextInt();
        int y2 =scanner.nextInt();
        int xa =scanner.nextInt();
        int ya =scanner.nextInt();
        if (x1==x2){
            System.out.println(2*x1-xa);
            System.out.println(ya);
        }
        if (y1==y2){
            System.out.println(xa);
            System.out.println(2*y1-ya);
        }
    }
}