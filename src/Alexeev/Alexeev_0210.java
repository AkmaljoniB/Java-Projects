package Alexeev;

import java.util.Scanner;

public class Alexeev_0210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int a =0;
        for (int i = n-1; i > 1; i--){
            if ((n*n)%i==0){
                System.out.println(i);
                a++;
                break;
            }
        }
        if (n==1 || a ==0){
            System.out.println(n);
        }
    }
}
