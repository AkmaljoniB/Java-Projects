package Alexeev;

import java.util.Scanner;

public class Alexeev_0499 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int w = scanner.nextInt();
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int b3 = scanner.nextInt();
        if ((a1+a2+a3<=w && b1+b2+b3>=k) ||(a1+a2<=w && b1+b2>=k)||(a1+a3<=w && b1+b3>=k)||(a2+a3<=w && b2+b3>=k)||(a1<=w &&b1>=k)||(a2<=w && b2>=k)||(a3<=w && b3>=k)) System.out.println("YES");
        else System.out.println("NO");
    }
}
