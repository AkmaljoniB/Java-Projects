package Alexeev;

import java.util.Scanner;

public class Alexeev_0346 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a+b==c){
            System.out.println("Yes");
            System.out.println(a+" "+b);
        } else if (a/10+(a%10)*10+b==c){
            System.out.println("Yes");
            System.out.println((a/10+(a%10)*10)+" "+b);
        } else if (a/10+(a%10)*10+b/10+(b%10)*10==c){
            System.out.println("Yes");
            System.out.println((a/10+(a%10)*10)+" "+(b/10+(b%10)*10));
        } else if (a+ b/10+(b%10)*10==c){
            System.out.println("Yes");
            System.out.println(a+" "+(b/10+(b%10)*10));
        } else {
            System.out.println("No");
        }
    }
}
