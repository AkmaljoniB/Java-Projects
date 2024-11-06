package Alexeev;

import java.util.Scanner;

public class Alexeev_0148 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
//        for (int i = a; i > 0; i--) {
//            if (a % i == 0 && b % i == 0){
//                System.out.println(i);
//                break;
//            }
//        }
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        while (min > 0) {
            int n = max % min;
            max = min;
            min = n;
        }
        System.out.println(max);
    }
}
