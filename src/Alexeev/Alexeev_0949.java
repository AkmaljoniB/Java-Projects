package Alexeev;

import java.util.Scanner;

public class Alexeev_0949 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a0=0;
        int n= scanner.nextInt();
        int a1 =scanner.nextInt();
        int a2 =scanner.nextInt();
        for (int i =0; i<n-1;i++){
            a0 = a2-a1;
            a2 = a1;
            a1 = a0;
        }
        System.out.println(a1);
        System.out.println(a2);
    }
}