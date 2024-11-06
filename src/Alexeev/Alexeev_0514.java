package Alexeev;

import java.util.Scanner;

public class Alexeev_0514 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int t=0;
        for (int i =1; i<=a;i++){
            if (a>=0){
                a-=i;
                t++;
            }
        }
        System.out.println(t);
    }
}