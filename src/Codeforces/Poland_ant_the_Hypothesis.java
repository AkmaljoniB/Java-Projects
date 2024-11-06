package Codeforces;

import java.util.Scanner;

public class Poland_ant_the_Hypothesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) System.out.println(3);
        else if (n==2) System.out.println(4);
        else System.out.println(n % 2 == 0 ? n - 2 : 1);
    }
}
