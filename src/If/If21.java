package If;

import java.util.Scanner;

public class If21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a==0 && b==0) {
            System.out.println("0");
        }
        if (a!=0 && b==0) {
            System.out.println("1");
        }
        if (a==0 && b!=0) {
            System.out.println("2");
        }
        if (a!=0 && b!=0) {
            System.out.println("3");
        }
    }
}
