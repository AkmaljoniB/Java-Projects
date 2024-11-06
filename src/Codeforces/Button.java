package Codeforces;

import java.util.Scanner;

public class Button {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = n;
        for (int i=1;i<n;i++)s+=i*(n-i);
        System.out.println(s);
    }
}
