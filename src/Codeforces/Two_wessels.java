package Codeforces;

import java.util.Scanner;

public class Two_wessels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d =Math.abs(a-b)/2+Math.abs(a-b)%2;
            System.out.println(d%c==0?d/c:d/c+1);
        }
    }
}
