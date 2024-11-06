package Alexeev;

import java.util.Scanner;

public class Alexeev_0023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long s =0 ;
        for (long i = 1; i <= a; i++){
            if (a % i == 0){
                s = s + i ;
            }
        }
        System.out.println(s);
    }
}