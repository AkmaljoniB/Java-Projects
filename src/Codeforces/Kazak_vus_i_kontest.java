package Codeforces;

import java.util.Scanner;

public class Kazak_vus_i_kontest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if (n<=m&&n<=k){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}