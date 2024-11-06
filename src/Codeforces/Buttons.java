package Codeforces;

import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if ((c%2==0&&b>=a)||b>a){
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }
}
