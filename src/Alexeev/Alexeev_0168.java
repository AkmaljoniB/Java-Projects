package Alexeev;

import java.util.Scanner;

public class Alexeev_0168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = "";
        for (int i = 1; i <= n; i++) s=s.concat(String.valueOf(i));
        System.out.println(s.indexOf(String.valueOf(n))+1);
    }
}
