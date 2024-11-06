package Alexeev;

import java.util.Scanner;

public class Alexeev_0271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = 0, b = 1, c = 0,e=1;
        boolean bo=false;
        while (c<=n){
            c = a + b;
            a = b;
            b = c;
            e++;
            if (c == n) {
                System.out.println(1);
                System.out.println(e);
                bo=true;
            }
        }
        if (!bo) System.out.println(0);
    }
}