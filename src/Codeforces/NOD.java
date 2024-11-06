package Codeforces;

import java.util.Scanner;

public class NOD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
