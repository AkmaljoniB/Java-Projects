package Alexeev;

import java.util.Scanner;

public class Alexeev_0004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n<10){
            System.out.print(n+"9"+(9-n));
        }
    }
}
