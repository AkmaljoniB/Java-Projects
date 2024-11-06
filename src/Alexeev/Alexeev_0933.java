package Alexeev;

import java.util.Scanner;

public class Alexeev_0933 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int t = scanner.nextInt();
        if (a>=t){
            System.out.println(t*b);
        } else {
            System.out.println((a*b)+(t-a)*c);
        }
    }
}
