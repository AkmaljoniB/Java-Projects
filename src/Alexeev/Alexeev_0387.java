package Alexeev;

import java.util.Scanner;

public class Alexeev_0387 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        for (int i = 0 ; i < n;i++){
            String s = scanner.next();
            if (s.substring(0,1).equals(s.substring(3,4)))n++;
        }
        System.out.println(n);
    }
}
