package Alexeev;

import java.util.Scanner;

public class Alexeev_0643 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int p = a, c =0;
        for (int i =1; i<=a; i++) {
            if (p%2==1){
                c++;
            }
            if (p==1){
                break;
            }
            p = p / 2;
        }
        System.out.println(a+c);
    }
}
